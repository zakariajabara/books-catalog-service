package io.jaba.tutorials.bookscatalogservice.model;

public class User {
	private String userId;
	
	private String name;

	public User(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public User() {
	
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
