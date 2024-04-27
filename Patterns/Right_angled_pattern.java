public class Right_angled_pattern {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {

         // Outer loop to iterate through each row
         for (int i = 0; i < n; i++) {
            // Inner loop to print asterisks in the current row
            for (int j = 0; j <= i; j++) {
                // Print an asterisk followed by a space
                System.out.print("* ");
            }
            // Move to the next line after finishing the current row
            System.out.println();
        }
    }
}

// Output

// * 
// * *
// * * *
// * * * *
// * * * * *
