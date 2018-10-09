package com.capgemini.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbappApplication.class, args);
		/*TextCriteria criteria =TextCriteria.forDefaultLanguage().matching("Electonics");
		List<Product> products= repo.findAllBy(criteria);*/
	}
}
