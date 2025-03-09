package com.csw2.ObjectClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class BookOperation {
	ArrayList<Book> library;
	HashMap<Student, ArrayList<Book>> issuedBooks;
	
	public BookOperation() {
		this.library = new ArrayList<Book>();
		this.issuedBooks = new HashMap<Student, ArrayList<Book>>();
	}
	
	public void addBook(Book b) {
		library.add(b);
		System.out.println("Book Added: "+ b);
	}
	
	public void issueBook(Student s, Book b) {
		if(library.isEmpty()) {
			System.out.println("Library is empty.");
			return;
		} else if(library.contains(b)) {
			library.remove(b);
			if(issuedBooks.containsKey(s)) {
				ArrayList<Book> issued = issuedBooks.get(s);
				issued.add(b);
				issuedBooks.put(s, issued);
			} else {
				ArrayList<Book> issued = new ArrayList<Book>();
				issued.add(b);
				issuedBooks.put(s, issued);
			}
			System.out.println("Book issued to " + s);
			return;
		} else {
			System.out.println("Book not present in Library.");
			return;
		}
	}
	
	public void viewIssuedBook(Student s) {
		if(!issuedBooks.containsKey(s) || issuedBooks.isEmpty()) System.out.println("Student " + s.getName() + "hasn't issued any books.");
		else {
			if(issuedBooks.get(s).isEmpty()) System.out.println("Student " + s.getName() + " hasn't issued any books.");
			else {
				ArrayList<Book> issued = issuedBooks.get(s);
				System.out.println(s.getName() + ": ");
				for (Book b : issued) {
					System.out.println(b);
				}
			}
		}
		System.out.println();
		return;
	}
	
	public void returnIssuedBook(Student s, Book b) {
		boolean found = true;
		if(!issuedBooks.containsKey(s)) found = false;
		else {
			if(issuedBooks.get(s).remove(b)) library.add(b); 
			else found = false;
		}
		if(!found) System.out.println(s.getName() + " hasn't issued book "+ b.getTitle());
		if(found) System.out.println(s.getName() + " returned " + b.getTitle());
		System.out.println();
		return;
	}
	
	public void viewAllIssuedBooks() {
		if(issuedBooks.isEmpty()) System.out.println("No issued Books.");
		else {
			Set<Student> student = issuedBooks.keySet();
			for(Student s : student) {
				if(issuedBooks.get(s).isEmpty()) continue;
				ArrayList<Book> issued = issuedBooks.get(s);
				System.out.println(s.getName() + ": ");
				for (Book b : issued) {
					System.out.println(b);
				}
			}
		}
		System.out.println();
		return;
	}
}

















