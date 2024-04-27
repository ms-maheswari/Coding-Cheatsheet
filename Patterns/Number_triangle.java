public class Number_triangle {
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }

    private static void printPattern(int n) {
        // Outer loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print the current number 'i', 'i' times in each row
            for (int j = 1; j <= i; j++) {
                // Print the current number followed by a space
                System.out.print(i + " ");
            }
            // Move to the next line after finishing the current row
            System.out.println();
        }
    }
}

// Output 

// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5