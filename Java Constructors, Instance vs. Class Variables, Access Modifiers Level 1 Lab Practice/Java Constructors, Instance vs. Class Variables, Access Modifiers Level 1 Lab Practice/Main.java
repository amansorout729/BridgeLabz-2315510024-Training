package oops2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Mobile Phone", 25000.0);
        Product p3 = new Product("Headphones", 2000.0);
        System.out.println("Product Details");
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        p3.displayProductDetails();
        System.out.println();
        Product.displayTotalProducts();
    }
}
