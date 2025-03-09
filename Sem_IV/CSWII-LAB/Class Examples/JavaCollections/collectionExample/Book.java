package com.csw2.collectionExample;

public class Book {
	private String title,author;
	private int id;
	
	public Book(String title, String author, int id) {
		this.title = title;
		this.author = author;
		this.id = id;
	}

	public String gettitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getId() {
		return id;
	}

}
