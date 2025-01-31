class OneBHK {
    protected double roomArea;
    protected double hallArea;
    protected double price;

  
    public OneBHK() {
        this.roomArea = 0;
        this.hallArea = 0;
        this.price = 0;
    }

    
    public OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    
    public void show() {
        System.out.println("Room Area: " + roomArea + " sq.ft");
        System.out.println("Hall Area: " + hallArea + " sq.ft");
        System.out.println("Price: Rs." + price);
    }
}

class TwoBHK extends OneBHK {
    private double room2Area;

    
    public TwoBHK() {
        super();
        this.room2Area = 0;
    }

    
    public TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

  
    @Override
    public void show() {
        super.show();
        System.out.println("Second Room Area: " + room2Area + " sq.ft");
    }

    public double getPrice() {
        return price;
    }
}

public class XYZ {
    public static void main(String[] args) {
        // Creating three TwoBHK objects
        TwoBHK flat1 = new TwoBHK(500, 300, 5000000, 450);
        TwoBHK flat2 = new TwoBHK(600, 350, 6000000, 500);
        TwoBHK flat3 = new TwoBHK(700, 400, 7000000, 550);

        
        System.out.println("Flat 1 Details:");
        flat1.show();
        System.out.println();

        System.out.println("Flat 2 Details:");
        flat2.show();
        System.out.println();

        System.out.println("Flat 3 Details:");
        flat3.show();
        System.out.println();

        
        double totalAmount = flat1.getPrice() + flat2.getPrice() + flat3.getPrice();
        System.out.println("Total Price of all flats: Rs." + totalAmount);
    }
}

