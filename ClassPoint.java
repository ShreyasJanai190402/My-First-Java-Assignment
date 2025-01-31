
class Point {
    int x, y;

    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

  
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


class Rectangle {
    Point topLeft, bottomRight;

  
    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        this.topLeft = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }


    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    
    public Rectangle(Rectangle other) {
        this.topLeft = new Point(other.topLeft);
        this.bottomRight = new Point(other.bottomRight);
    }

    @Override
    public String toString() {
        return "Rectangle [Top Left: " + topLeft + ", Bottom Right: " + bottomRight + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        System.out.println("Rectangle 1: " + rect1);

        
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Rectangle rect2 = new Rectangle(p1, p2);
        System.out.println("Rectangle 2: " + rect2);

        
        Rectangle rect3 = new Rectangle(rect1);
        System.out.println("Rectangle 3 (copied from rect1): " + rect3);
    }
}
