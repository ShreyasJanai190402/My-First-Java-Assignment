class Tile {
    private int edgeLength;

  
    public Tile(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    
    public int getEdgeLength() {
        return edgeLength;
    }
}

class Floor {
    private int length;
    private int width;

    
    public Floor(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public int totalTiles(Tile t) {
        int tileSize = t.getEdgeLength();
        
      
        int tilesLengthwise = (int) Math.ceil((double) length / tileSize);
        int tilesWidthwise = (int) Math.ceil((double) width / tileSize);
        
        return tilesLengthwise * tilesWidthwise;
    }
}

public class Main {
    public static void main(String[] args) {
        Tile tile = new Tile(2); 
        Floor floor = new Floor(5, 7); 

        System.out.println("Total tiles needed: " + floor.totalTiles(tile));
    }
}
