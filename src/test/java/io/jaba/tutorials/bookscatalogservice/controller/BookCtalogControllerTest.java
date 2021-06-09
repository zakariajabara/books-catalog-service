package io.jaba.tutorials.bookscatalogservice.controller;

/*
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.springframework.boot.web.server.LocalServerPort;

*/
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.web.server.LocalServerPort;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
//@WebMvcTest(BookCtalogController.class)
public class BookCtalogControllerTest {

	//Mocking enviroement MockMvc
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	TestRestTemplate restTemplate;
		
	@LocalServerPort 
	int port;
	
	@Test
	public void testResttemplate()
	{
		System.out.println("      >>>>>>>>>>>>>>>>>>>>>>  PORT =" + port);
	ResponseEntity<String> respEntity = restTemplate.getForEntity("/catalog/zac", String.class);
	assertThat(respEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
	assertThat(respEntity.getBody()).contains("SpringBoot");
	}
	
	@Test
	public void testMocking() throws Exception {

		 // when
        MockHttpServletResponse response = mockMvc.perform( get("/catalog/zac").accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
        
        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
		assertThat(response.getContentType()).isEqualTo(MediaType.APPLICATION_JSON_VALUE);
		String body = this.restTemplate.getForObject("/catalog/zac", String.class);
		assertThat(body).contains("SpringBoot");
		
	}

}
