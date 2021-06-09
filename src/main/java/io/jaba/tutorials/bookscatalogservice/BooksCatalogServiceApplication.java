package io.jaba.tutorials.bookscatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BooksCatalogServiceApplication {

	//@Bean
	public RestTemplate initRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	public static void main(String[] args) {
		SpringApplication.run(BooksCatalogServiceApplication.class, args);
	}

}
