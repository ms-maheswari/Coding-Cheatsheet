import java.util.Scanner;

public class PrimeNumbersInRange {

       public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Read the start and end values of the range
        System.out.print("Enter the starting value of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending value of the range: ");
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers in the range " + start + " to " + end + ":");
        
        // Iterate through each number in the range
        for (int num = start; num <= end; num++) {
            
            // Check if the current number is prime
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
         // Method to check if a number is prime
        public static boolean isPrime(int num) {
           // Return false for numbers less than 2
           if (num < 2) {
            return false;
        }
           // Check divisibility from 2 to the square root of the number
           for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // num is divisible, so it's not prime
            }
        }
        return true; // num is prime
    
}

}