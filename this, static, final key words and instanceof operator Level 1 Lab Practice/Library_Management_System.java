package oops5;

class Book {
    private static String libraryName = "City Central Library";
    private String title;
    private String author;
    private final String isbn;   
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}


public class Library_Management_System {
	public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book b2 = new Book("1984", "George Orwell", "ISBN002");
        if (b1 instanceof Book) {
            b1.displayDetails();
        }

        if (b2 instanceof Book) {
            b2.displayDetails();
        }
        Book.displayLibraryName();
    }

}
