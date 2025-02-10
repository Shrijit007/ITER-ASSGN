abstract class LibraryResources{
    private String title, author;
    LibraryResources(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    abstract void displayDetails();
}

class Book extends LibraryResources{
    private int pageCount;
    Book(String title, String author, int pageCount){
        super(title, author);
        this.pageCount = pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }
    public void displayDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("pageCount: " + getPageCount()+"\n");
    }
}

class Magazine extends LibraryResources{
    private int issueDate;
    Magazine(String title, String author, int issueDate){
        super(title, author);
        this.issueDate = issueDate;
    }
    public void setIssueDate(int issueDate){
        this.issueDate = issueDate;
    }
    public int getIssueDate(){
        return issueDate;
    }
    public void displayDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Number: " + getIssueDate()+"\n");
    }
}

class dvd extends LibraryResources{
    private int duration;
    dvd(String title, String author, int duration){
        super(title, author);
        this.duration = duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
    public void displayDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration()+"\n");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling", 500);
        Magazine m1 = new Magazine("Forbes", "Steve Forbes", 2021);
        dvd d1 = new dvd("Inception", "Christopher Nolan", 180);
        b1.displayDetails();
        m1.displayDetails();
        d1.displayDetails();
    }
}