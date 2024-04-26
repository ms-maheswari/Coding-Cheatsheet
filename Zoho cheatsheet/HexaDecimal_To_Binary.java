public class HexaDecimal_To_Binary {

    public static void main(String[] args) {

        // Define the hexadecimal string to convert
        
        String hexString = "1A3F";
        
        // Convert the hexadecimal string to a binary string

        String binaryString = hexToBinary(hexString);
        
        // Print the original hexadecimal string and its binary representation

        System.out.println("Hexadecimal: " + hexString);
        System.out.println("Binary: " + binaryString);
    }

     // Method to convert a hexadecimal string to a binary string

     public static String hexToBinary(String hexString) {
        // Convert hexadecimal string to an integer (base 16)

        int decimalValue = Integer.parseInt(hexString, 16);
        
        // Convert the integer value to a binary string

        return Integer.toBinaryString(decimalValue);
    }

}
