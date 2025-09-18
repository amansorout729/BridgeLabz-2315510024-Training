package snippet;

interface Taxable {
 double calculateTax();
 String getTaxDetails();
}

abstract class Product {
 private int productId;
 private String name;
 private double price;

 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 public int getProductId() { return productId; }
 public String getName() { return name; }
 public double getPrice() { return price; }
 public void setPrice(double price) { this.price = price; }

 public abstract double calculateDiscount();

 public void displayDetails() {
     System.out.println("Product ID: " + productId);
     System.out.println("Name: " + name);
     System.out.println("Price: " + price);
 }
}

class Electronics extends Product implements Taxable {
 public Electronics(int id, String name, double price) {
     super(id, name, price);
 }

 public double calculateDiscount() {
     return getPrice() * 0.10;  
 }

 public double calculateTax() {
     return getPrice() * 0.18;  
 }

 public String getTaxDetails() {
     return "Electronics GST: 18%";
 }
}

class Clothing extends Product implements Taxable {
 public Clothing(int id, String name, double price) {
     super(id, name, price);
 }

 public double calculateDiscount() {
     return getPrice() * 0.20; 
 }

 public double calculateTax() {
     return getPrice() * 0.05;  
 }

 public String getTaxDetails() {
     return "Clothing GST: 5%";
 }
}

class Groceries extends Product {
 public Groceries(int id, String name, double price) {
     super(id, name, price);
 }

 public double calculateDiscount() {
     return getPrice() * 0.05;  
 }

}

public class ECommercePlatform {
 public static void main(String[] args) {
     Product p1 = new Electronics(201, "Laptop", 60000);
     Product p2 = new Clothing(202, "T-Shirt", 1500);
     Product p3 = new Groceries(203, "Apples", 500);

     Product[] products = {p1, p2, p3};

     calculateFinalPrices(products);
 }

 public static void calculateFinalPrices(Product[] products) {
     for (Product p : products) {
         p.displayDetails();

         double tax = 0;
         if (p instanceof Taxable) {
             Taxable t = (Taxable) p;
             tax = t.calculateTax();
             System.out.println(t.getTaxDetails());
         } else {
             System.out.println("No tax applicable.");
         }

         double discount = p.calculateDiscount();
         double finalPrice = p.getPrice() + tax - discount;

         System.out.println("Discount: " + discount);
         System.out.println("Tax: " + tax);
         System.out.println("Final Price: " + finalPrice);
         System.out.println("----------------------------");
     }
 }
}
