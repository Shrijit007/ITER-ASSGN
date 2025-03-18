//Q2

public class Book {
    private String bookName;
    private int bookId;
    private double price;

    public Book(String bookName, int bookId, double price) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.price = price;
    }
    
    public String toString() {
        return "Book: " + bookName + ", Id: " + bookId + ", price: " + price;
    }

    public boolean equals(Book obj) {
        return this.price == obj.price;
    }
}

class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java", 123, 200.0);
        Book book2 = new Book("Python", 456, 200.0);
        System.out.println(book1  + "\n" + book2);
        System.out.println("Are the prices of book1 and book2 equal? " + book1.equals(book2));
    }
    
}