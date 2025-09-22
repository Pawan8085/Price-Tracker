package com.app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceTrackerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PriceTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {
			String url = "https://www.amazon.in/HP-Multi-Device-Bluetooth-Resistant-Auto-Detection/dp/B0BR3Z3NJ9/ref=mp_s_a_1_2_sspa?crid=FHPZ7Y5EU1JP&dib=eyJ2IjoiMSJ9.ERTBHYYXWQWidmG8WWT07RNXYzYMBRL13NNXcYnTm0_dddW_PEuPUU7LqDKDRj0W01uN3dFxuKqHaB_mGvwRQ2vJq9vuh7rnr7zcMRKc_dg_PSeiUqHPKBlGeKy0iJD7dbLpkU_rsD4Oua4q6ULaf3NqY8uuP-nMtY1TE7nGnxLp18rav9UtSFeq9zLy4nIA6uy9mKwVkic5pxDOwBp8aA.JkIihDluuu-JXiTcvbiGlyqz3CW666kcMqZlDFKvmWo&dib_tag=se&keywords=slim%2Bkeyboard&qid=1756108092&sprefix=slim%2Bkeyboar%2Caps%2C388&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9waG9uZV9zZWFyY2hfYXRm&th=1";



			Document document = Jsoup.connect(url)
					.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36")
					.timeout(10000)
					.get();

			Element titleEl = document.selectFirst("#productTitle");
			String title = titleEl != null ? titleEl.text().trim() : null;
			Element priceEl = document.selectFirst(".a-price-whole");
			String price = priceEl != null ? priceEl.text().trim() : null;

			Element urlEl = document.selectFirst("#landingImage");
			String productUrl = null;
			if (urlEl != null) {
				productUrl = urlEl.attr("src").trim();
			}

			StringBuilder priceStr = new StringBuilder();
			for(char c : price.toCharArray()){

				if(Character.isDigit(c)){
					priceStr.append(c);
				}
			}

			int productPrice = Integer.parseInt(priceStr.toString());


			System.out.println("Title: " + title);
			System.out.println("Price: "+productPrice);
			System.out.println("Url : "+productUrl);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
