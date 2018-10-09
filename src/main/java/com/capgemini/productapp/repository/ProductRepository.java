package com.capgemini.productapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.productapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{
	
	@Query("{'productPrice':{$gt:?0 , $lt:?1}	,	'productCategory':?2")
	public List<Product> findByProductByPriceCategory(int  lowPrice,int highPrice,String productCategory);

/*	
	@Query("{'productManufacturer': $0, 'productPrice': {$gt:?1 , $lt:?2}")
	public List<Product> findByProductManufacturerPrice(String productManufacturer, int lowprice,int highPrice);
 	*/

	

}
