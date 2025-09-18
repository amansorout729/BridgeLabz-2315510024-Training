package snippet;


interface Discountable {
 void applyDiscount(double percent);
 String getDiscountDetails();
}

abstract class FoodItem implements Discountable {
 private String itemName;
 private double price;
 private int quantity;
 private double discountApplied = 0;

 public FoodItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 public String getItemName() { return itemName; }
 public double getPrice() { return price; }
 public int getQuantity() { return quantity; }

 protected void setPrice(double price) { this.price = price; }


 public void applyDiscount(double percent) {
     if (percent > 0 && percent <= 50) {
         discountApplied = percent;
     } else {
         System.out.println("Invalid discount percentage!");
     }
 }

 public String getDiscountDetails() {
     return "Discount Applied: " + discountApplied + "%";
 }

 public double getDiscountApplied() {
     return discountApplied;
 }
 public abstract double calculateTotalPrice();

 public void getItemDetails() {
     System.out.println("Item: " + itemName);
     System.out.println("Price: " + price);
     System.out.println("Quantity: " + quantity);
 }
}
class VegItem extends FoodItem {
 public VegItem(String name, double price, int qty) {
     super(name, price, qty);
 }

 public double calculateTotalPrice() {
     double baseTotal = getPrice() * getQuantity();
     double discount = baseTotal * (getDiscountApplied() / 100);
     return baseTotal - discount;
 }
}

class NonVegItem extends FoodItem {
 public NonVegItem(String name, double price, int qty) {
     super(name, price, qty);
 }

 public double calculateTotalPrice() {
     double baseTotal = getPrice() * getQuantity();
     double nonVegCharge = baseTotal * 0.10; 
     double totalWithCharge = baseTotal + nonVegCharge;
     double discount = totalWithCharge * (getDiscountApplied() / 100);
     return totalWithCharge - discount;
 }
}

public class OnlineFoodDeliverySystem {
 public static void main(String[] args) {
     FoodItem item1 = new VegItem("Paneer Tikka", 200, 2);
     FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

     item1.applyDiscount(10);   
     item2.applyDiscount(15);   

     FoodItem[] order = {item1, item2};
     processOrder(order);
 }

 public static void processOrder(FoodItem[] items) {
     double grandTotal = 0;
     System.out.println("------- ORDER DETAILS -------");
     for (FoodItem f : items) {
         f.getItemDetails();
         System.out.println(f.getDiscountDetails());
         double total = f.calculateTotalPrice();
         System.out.println("Total Price: " + total);
         System.out.println("----------------------------");
         grandTotal += total;
     }
     System.out.println("Grand Total: " + grandTotal);
 }
}
