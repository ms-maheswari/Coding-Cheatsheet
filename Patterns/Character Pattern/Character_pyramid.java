import java.util.Scanner;

public class Character_pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();
        
        // Initialize the ASCII code variable for characters, starting at 64
        // ASCII value 64 is just before 'A' (which is 65)
        int a = 64;
        
        // Outer loop for each row from 1 to 'n'
        for (int i = 1; i <= n; i++) {

            // Inner loop for each column within the row (from 1 to 'i')
            for (int j = 1; j <= i; j++) {
                // Increment the ASCII code variable by 1
                a++;
                // Convert the ASCII code to a character and print it with a space after each character
                System.out.print((char) a + "  ");
            }
            // After printing each row, move to the next line
            System.out.println();
        }
    }
}


// INPUT:

// 4

// OUTPUT:

// A 
// B C 
// D E F 
// G H I J