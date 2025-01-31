import java.util.Scanner;

class Circle {

    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public void display() {
        double area = calculateArea();
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}

public class CircleClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

    
        Circle circle = new Circle(radius);

  
        circle.display();
        
        scanner.close();
    }
}
