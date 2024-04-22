import java.util.Scanner;
public class Binarytohexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input binary number
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        
        // Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        
        // Display the hexadecimal number
        System.out.println("Hexadecimal equivalent: " + hexadecimal.toUpperCase());
        
        scanner.close();
    }
}

