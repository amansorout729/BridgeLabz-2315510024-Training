package snippet;

interface Reservable {
 void reserveItem(String borrowerName);
 boolean checkAvailability();
}

abstract class LibraryItem implements Reservable {
 private String itemId;
 private String title;
 private String author;

 private String borrowerName;
 private boolean isReserved = false;

 public LibraryItem(String itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 public String getItemId() { return itemId; }
 public String getTitle() { return title; }
 public String getAuthor() { return author; }

 protected String getBorrowerName() { return borrowerName; }

 public void reserveItem(String borrowerName) {
     if (!isReserved) {
         this.borrowerName = borrowerName;
         isReserved = true;
         System.out.println(title + " reserved by " + borrowerName);
     } else {
         System.out.println(title + " is already reserved!");
     }
 }
 public boolean checkAvailability() {
     return !isReserved;
 }

 public abstract int getLoanDuration();

 public void getItemDetails() {
     System.out.println("Item ID: " + itemId);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Available: " + (checkAvailability() ? "Yes" : "No"));
 }
}

class Book extends LibraryItem {
 public Book(String id, String title, String author) {
     super(id, title, author);
 }

 public int getLoanDuration() {
     return 14;
 }
}

class Magazine extends LibraryItem {
 public Magazine(String id, String title, String author) {
     super(id, title, author);
 }
 public int getLoanDuration() {
     return 7; // 1 week
 }
}

class DVD extends LibraryItem {
 public DVD(String id, String title, String author) {
     super(id, title, author);
 }

 public int getLoanDuration() {
     return 3; // 3 days
 }
}

public class LibraryManagementSystem {
 public static void main(String[] args) {
     LibraryItem item1 = new Book("B001", "Java Programming", "James Gosling");
     LibraryItem item2 = new Magazine("M101", "Tech Today", "Various Authors");
     LibraryItem item3 = new DVD("D501", "Inception", "Christopher Nolan");

     LibraryItem[] items = {item1, item2, item3};

     for (LibraryItem item : items) {
         item.getItemDetails();
         System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
         System.out.println("----------------------------");
     }

     item1.reserveItem("Alice");
     item2.reserveItem("Bob");
     item1.reserveItem("Charlie");
 }
}
