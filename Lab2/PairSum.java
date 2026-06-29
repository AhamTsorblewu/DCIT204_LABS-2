import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the array size from user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Creating the array
        int[] numbers = new int[size];
        
        // Getting the array elements from user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Getting the target sum from user
        System.out.print("Enter the Target Sum: ");
        int targetSum = scanner.nextInt();
        
        // Implementing Brute Force Search for pair
        boolean pairFound = false;
    
        System.out.println("Target Sum: " + targetSum);
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("Found pair");
                    System.out.println("Index " + i + " + Index " + j + " = " + targetSum);
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    pairFound = true;
                    break;
                }
            }
            if (pairFound) {
                break;
            }
        }
        
        if (!pairFound) {
            System.out.println("Found no pair that sums to " + targetSum);
        }
        
        scanner.close();
    }
}