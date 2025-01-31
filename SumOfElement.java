import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][4]; 
        int sum = 0;

        
        System.out.println("Enter 17 numbers:");
        for (int i = 0, count = 0; i < 5 && count < 17; i++) {
            for (int j = 0; j < 4 && count < 17; j++, count++) {
                array[i][j] = scanner.nextInt();
                sum += array[i][j];
            }
        }
        
        
        System.out.println("Sum of all elements: " + sum);
        
        scanner.close();
    }
}
