package io.jaba.tutorials.bookscatalogservice.model;

public class Rating {
	private String bookId;
	private int ratting;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public int getRatting() {
		return ratting;
	}
	public void setRatting(int ratting) {
		this.ratting = ratting;
	}
	public Rating(String bookId, int ratting) {
		super();
		this.bookId = bookId;
		this.ratting = ratting;
	}
	
}
