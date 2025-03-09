package com.csw2.ObjectClass;

public class BookMain {
	public static void main(String[] args) {
		
        Student s1 = new Student("ABC", 1);
        Student s2 = new Student("XYZ", 2);

        Book b1 = new Book(1, "Python", "S. Bala");
        Book b2 = new Book(2, "Java Basics", "John Doe");
        Book b3 = new Book(3, "C++ Programming", "Jane Smith");
        Book b4 = new Book(4, "Data Structures", "Alice Johnson");
        Book b5 = new Book(5, "Algorithms", "Bob Lee");
        Book b6 = new Book(6, "Machine Learning", "David Brown");

        BookOperation operation = new BookOperation();
        operation.addBook(b1);
        operation.addBook(b2);
        operation.addBook(b3);
        operation.addBook(b4);
        operation.addBook(b5);
        operation.addBook(b6);
        System.out.println();
        
        operation.issueBook(s1, b6);
        operation.issueBook(s2, b4);
        operation.issueBook(s2, b6);
        operation.issueBook(s1, b5);
        operation.issueBook(s2, b3);
        operation.issueBook(s2, b1);
        System.out.println();
        
        operation.viewIssuedBook(s2);
        operation.viewIssuedBook(s1);
        
        operation.returnIssuedBook(s2, b3);
        operation.returnIssuedBook(s2, b6);
        
        operation.viewAllIssuedBooks();
        
	}
}
