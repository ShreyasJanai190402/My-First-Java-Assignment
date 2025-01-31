import java.util.Arrays;
import java.util.Scanner;

public class SortDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        
        Arrays.sort(numbers);
        
        
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        
        
        System.out.println("Sorted numbers in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
