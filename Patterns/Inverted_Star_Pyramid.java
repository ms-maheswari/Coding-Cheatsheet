public class Inverted_Star_Pyramid {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
     // Outer loop to iterate through each row.
     for (int i = 1; i <= n; i++) {
        // Inner loop to print leading spaces in each row.
        for (int j = 1; j <= i; j++) {
            System.out.print(" ");
        }
        
        // Inner loop to print the first part of stars in each row.
        for (int j = i; j < n; j++) {
            System.out.print("*");
        }
        
        // Inner loop to print the second part of stars in each row.
        for (int j = i; j <= n; j++) {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}

// Output

// *********
//  *******  
//   *****  
//    *** 
//     *