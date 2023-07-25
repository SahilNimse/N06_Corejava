package org.tnsif.classandobjects;
//class declaration
public class Library {

	public long noOfBooks;
	public String authorName;
	public String BookName;
	public double Price;
	public Library() {
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		BookName = bookName;
		Price = price;
		System.out.println("Parameterized Constructor");
	}
	@Override
	public String toString() {
		return "Library [noOfBooks =" + noOfBooks + " \nauthorName =" + authorName + " \nBookName =" + BookName + " \nPrice ="
				+ Price + "]";
	}
	
}
