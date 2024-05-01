package Pattern;

public class Alpha_HillPattern {
    static void printpattern(int n) {
        for(int i = 1; i <= n; i++) {
            int p = 'A'; // Initialize p with the ASCII value of 'A' for each row
            for(int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j < i; j++) {
                System.out.print((char) p++); // Increment p and then print the character
            }

            for(int j = 1; j <= i; j++) {
                System.out.print((char) p--); // Decrement p and then print the character
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printpattern(n);
    }
}
//       A
//      ABA
//     ABCBA
//    ABCDCBA
//   ABCDEDCBA
//  ABCDEFEDCBA