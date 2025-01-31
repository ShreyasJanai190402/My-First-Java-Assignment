import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        
        int sum = calculateSum(n);
        
    
        System.out.println("The sum of the first " + n + " integers is: " + sum);
        
      
        scanner.close();
    }
    
  
    public static int calculateSum(int n) {
  
        return n * (n + 1) / 2;
    }
}
