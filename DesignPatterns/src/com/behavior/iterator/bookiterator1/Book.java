package com.behavior.iterator.bookiterator1;

public class Book {
	 
	 private String name;
	 private String publication;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public Book(String name, String publication) {
		super();
		this.name = name;
		this.publication = publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	 
	
	}