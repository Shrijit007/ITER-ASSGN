//Q5

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}

class Library {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();

        books.put(1, new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 5));
        books.put(2, new Book(2, "1984", "George Orwell", 10));

        // Displaying the collection of books
        System.out.println("Collection of Books:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);

        // (a) Check if a particular book name is present in the map
        System.out.print("\nEnter the name of the book to check its presence: ");
        String bookName = scanner.nextLine();
        boolean bookFound = false;
        for (Book book : books.values()) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                bookFound = true;
                break;
            }
        }
        if (bookFound) {
            System.out.println("The book \"" + bookName + "\" is present in the library.");
        } else {
            System.out.println("The book \"" + bookName + "\" is not present in the library.");
        }

        // (b) Remove a book entry by deleting the value associated with a specific key
        System.out.print("\nEnter the ID of the book to remove: ");
        int bookId = scanner.nextInt();
        Book removedBook = books.remove(bookId);
        if (removedBook != null) {
            System.out.println("The book \"" + removedBook.getName() + "\" has been removed from the library.");
        } else {
            System.out.println("No book found with ID: " + bookId);
        }

        scanner.close();
    }
}