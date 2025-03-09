package com.csw2.collectionExample;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookOperation database = new BookOperation();
		Book b1 = new Book("ABC","Mr. xyz",1);
		Book b2 = new Book("DEF","Mr. uvw",2);
		Book b3 = new Book("GHI","Mr. abc",3);
		Book b4 = new Book("JKL","Mr. igh",4);
		Book b5 = new Book("MNO","Mr. ced",5);
		database.addBook(b5);
		database.addBook(b4);
		database.addBook(b3);
		database.addBook(b2);
		database.addBook(b1);
		database.issueBook(2);
		database.displayAllBook();
		database.displayAllIssuedBooks();
	}

}
