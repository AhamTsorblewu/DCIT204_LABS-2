import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting array size from user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Creating the array
        int[] numbers = new int[size];
        
        // Getting array elements from user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Finding maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        
        // results
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        System.out.println("\nMaximum Value: " + maxValue);
        System.out.println("Index of Maximum: " + maxIndex);
        
        scanner.close();
    }
}
