import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the product name and price
        // Create one Product object
        Product p1 = new Product(scanner.nextLine() , scanner.nextDouble());
        // Call display()
        p1.display();

        scanner.close();
    }
}
