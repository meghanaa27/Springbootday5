package com.meghana.Springbootday5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

}@Id
private int id;
private String bookName;
private float bookCost;
private int BookQuantity;
private String authorName;
public Book() {
	super();
}
public Book(int id, String bookName, float bookCost, int BookQuantity, String authorName) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.bookCost = bookCost;
	this.BookQuantity = BookQuantity;
	this.authorName = authorName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public float getBookCost() {
	return bookCost;
}
public void setBookCost(float bookCost) {
	this.bookCost = bookCost;
}
public int getBookQuantity() {
	return BookQuantity;
}
public void setBookQuantity(int bookQuantity) {
	BookQuantity = bookQuantity;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}


