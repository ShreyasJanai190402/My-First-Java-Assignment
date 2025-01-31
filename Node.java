
class Node {
    int data;
    Node next;

    
    public Node(int data) {
        this.data = data;
        this.next = null;  
    }

  
    public Node(Node other) {
        this.data = other.data;  
        if (other.next != null) {
            this.next = new Node(other.next);  
        } else {
            this.next = null;  
        }
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + (next != null ? next.data : "null") + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        
        Node node1 = new Node(10);
        System.out.println("Node 1: " + node1);

        
        Node node2 = new Node(20);
        node1.next = node2; 

      
        System.out.println("Node 1 after linking to Node 2: " + node1);
        System.out.println("Node 2: " + node2);

        
        Node node3 = new Node(node1);
        System.out.println("Node 3 (deep copy of Node 1): " + node3);
    }
}
