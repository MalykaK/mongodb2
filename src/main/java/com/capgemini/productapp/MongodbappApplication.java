package com.capgemini.productapp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.TextCriteria;

import com.capgemini.productapp.entity.Product;

@SpringBootApplication
public class MongodbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbappApplication.class, args);
		/*TextCriteria criteria =TextCriteria.forDefaultLanguage().matching("Electonics");
		List<Product> products= repo.findAllBy(criteria);*/
	}
}
