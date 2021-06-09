package io.jaba.tutorials.bookscatalogservice.model;

public class CatalogItem {

	private String title;
	private String desc;
	private int rating;
	
	public CatalogItem(String title, String desc, int rating ) {

		this(title, desc);
		this.rating=rating;
	}

	public CatalogItem(String title, String desc) {
		this.title=title;
		this.desc= desc;
		this.rating=0;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
