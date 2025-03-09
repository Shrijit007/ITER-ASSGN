package com.csw2.collectionExample;
import java.util.*;

public class BookOperation implements Comparator<Book>{
	private Vector<Book> books;
	private Stack<Book> issuedBooks;
	
	public BookOperation() {
		super();
		this.books = new Vector<Book>();
		this.issuedBooks = new Stack<Book>();
	}
	
	public void addBook(Book book) {
		this.books.add(book);
		System.out.println("Book added: "+ book.gettitle());
	}
	
	public void removeBook(int id) {
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if(b.getId() == id) {
				itr.remove();
				System.out.println("Book with ID: "+ id +" removed.");
				return;
			}
		}
		System.out.println("Book not found.");
	}
	
	public void displayAllBook() {
		if(books.isEmpty()) System.out.println("No books available in Collection.");
		else {
			System.out.println("Books in the collection are:");
			for (Book book : books) {
				System.out.println(book.getId()+" - "+book.gettitle());
			}
		}
	}
	
	public void issueBook(int id) {
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if(b.getId() == id) {
				itr.remove();
				issuedBooks.push(b);
				System.out.println("Book issued & collections updated.");
				return;
			}
		}
		System.out.println("Book not found.");
	}
	
	public void displayAllIssuedBooks() {
		if(issuedBooks.isEmpty()) System.out.println("No books available in Collection.");
		else {
			System.out.println("Books in the collection are:");
			for (Book book : issuedBooks) {
				System.out.println(book.getId()+" - "+book.gettitle());
			}
		}
	}
	
	public void returnLastIssuedBook() {
		if(issuedBooks.isEmpty()) System.out.println("No books available in Collection.");
		else {
			Book b = issuedBooks.pop();
			System.out.println("Returned Last book issued: " + b.getId() + " - " + b.gettitle());
			books.add(b);
		}
	}
	
	public void lastIssuedBook() {
		if(issuedBooks.isEmpty()) System.out.println("No books available in Collection.");
		else {
			Book b = issuedBooks.peek();
			System.out.println("Last issued book: " + b.getId() + " - " + b.gettitle());
		}	
	}
	
	public void searchIssuedBook(int id) {
		if(books.isEmpty() && issuedBooks.isEmpty()) {
			System.out.println("Collections are empty.");
		} else {
			for (Book book : books) {
				if(book.getId() == id) {
					System.out.println("Book found in Collection.");
					return;
				}
			}
			for (Book book : issuedBooks) {
				if(book.getId() == id) {
					System.out.println("Book found in issued Collection.");
					return;
				}
			}
		}
		System.out.println("Book not found in any collections.");
	}


	public int compare(Book o1, Book o2) {
		if(o1.getId()>o2.getId()) return 1;
		if(o1.getId()<o2.getId()) return -1;
		else return 0;
	}
}







