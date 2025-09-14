package oops5;


class Product {
    static double discount = 10.0; 
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }
    public void displayDetails() {
        double totalPrice = price * quantity;
        double finalPrice = totalPrice - (totalPrice * discount / 100);
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price (after " + discount + "% discount): " + finalPrice);
        System.out.println("------------------------------------");
    }
}

public class Shopping_Cart_System {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 50000, 1);
        Product p2 = new Product(202, "Mouse", 800, 2);

        if (p1 instanceof Product) {
            p1.displayDetails();
        }
        if (p2 instanceof Product) {
            p2.displayDetails();
        }

        Product.updateDiscount(15.0);
        p1.displayDetails();
        p2.displayDetails();
    }
}
