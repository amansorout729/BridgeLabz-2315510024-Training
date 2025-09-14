package oops2;

class Book {
	public String ISBN;
	protected String title;
	private String author;
	public Book(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	 public String getAuthor() {
	     return author;
	 }
	 public void setAuthor(String author) {
	     this.author = author;
	 }
	 public void displayInfo() {
	     System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
	 }
}

class EBook extends Book {
	private double fileSizeMB;
	public EBook(String ISBN, String title, String author, double fileSizeMB) {
		super(ISBN, title, author);
		this.fileSizeMB = fileSizeMB;
	}
	public void displayEBookInfo() {
     System.out.println("E-Book ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSizeMB + "MB");
 }
}

public class BookLibrarySystem {
	public static void main(String[] args) {
	     Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
	     b1.displayInfo();
	     b1.setAuthor("J. Bloch");
	     System.out.println("Updated Author: " + b1.getAuthor());
	     EBook eb1 = new EBook("978-0596009205", "Head First Java", "Kathy Sierra", 5.8);
	     eb1.displayInfo();     
	     eb1.displayEBookInfo();
	 }
}

