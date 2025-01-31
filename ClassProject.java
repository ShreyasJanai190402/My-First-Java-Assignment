import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class ProductClient {
    
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        Product[] products = new Product[5];

      
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

    
        Product highestPriceProduct = products[0];
        for (int i = 1; i < 5; i++) {
            if (products[i].price > highestPriceProduct.price) {
                highestPriceProduct = products[i];
            }
        }
        System.out.println("Product with highest price: Product ID = " + highestPriceProduct.pid +
                ", Price = " + highestPriceProduct.price);

        
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
        
        scanner.close();
    }
}
