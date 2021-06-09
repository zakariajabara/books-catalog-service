package io.jaba.tutorials.bookscatalogservice.controller;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.jaba.tutorials.bookscatalogservice.model.Book;
import io.jaba.tutorials.bookscatalogservice.model.CatalogItem;
import io.jaba.tutorials.bookscatalogservice.model.Rating;

/**
 * EndPoint füer BookCatalog
 * GET /catalog/{userId}   return the list of books with rating for a specified user
 * 
 * @author Zakaria.Jabara
 *
 */
@RestController
@RequestMapping("/catalog")
public class BookCtalogController {
 
	//@Autowired
	RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		
			
		List<Rating> ratings= Arrays.asList(
				new Rating("1234", 3),
				new Rating("5678", 4)
				);
				
		return ratings.stream().map(rating -> {
			Book book = restTemplate.getForObject("http://localhost:8082/books/"+ rating.getBookId(), Book.class);
			return new CatalogItem(book.getName(), "DESCR", rating.getRatting());
		}
		).collect(Collectors.toList());
//				.map(rating -> {
//			new CatalogItem("book", "Description Test", 5)
//		}).co
	 //return Collections.singletonList(new CatalogItem("SpringBoot", "Spring boot for beginner"));
			 
	}
}
