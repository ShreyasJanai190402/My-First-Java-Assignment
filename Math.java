public class Math {
    
    public static final double PI = 3.14;

  
    public static double getCircleArea(int radius) {
        return PI * radius * radius;  
    }

    public static void main(String[] args) {
        
        int radius = 5;
        double area = Math.getCircleArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}
