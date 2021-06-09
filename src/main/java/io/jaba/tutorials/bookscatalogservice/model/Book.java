package io.jaba.tutorials.bookscatalogservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Getter
//@RequiredArgsConstructor
//@NoArgsConstructor
public class Book {
	
	//later isbn, 
	private String bookId;
	
	private String name;


	public Book() {
	}

//	public Book(String bookId, String name) {
//		super();
//		this.bookId = bookId;
//		this.name = name;
//	}

//	public String getBookId() {
//		return bookId;
//	}
//
//	public void setBookId(String bookId) {
//		this.bookId = bookId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
	

}
