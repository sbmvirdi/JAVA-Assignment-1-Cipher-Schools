package com.example.demo12;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity// specify table
public class Book {
	
	
	@Id   //Specify column...id as primary key to whom we have mentioned
	private String id;
	private String publisher;
	private String author;
	private String date;
	
	public Book()
	{
	}
	
	
	public Book(String id, String publisher, String author, String date) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.author = author;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	
	

}
