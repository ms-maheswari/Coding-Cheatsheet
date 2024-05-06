// The problem is to given two strings, we have to remove the characters from the string2 which are present in string1
public class Remove_Character_from_string {
    public static void main(String[] args) {
        // Initialize string1 as "Computer" and string2 as "Cat".
        String s1 = "Computer";
        String s2 = "Cat";

        // Call the removeCharacter function with s1 and s2 as arguments and store the result.
        String result = removeCharacter(s1, s2);
        // Print the resulting modified version of string2.
        System.out.println("String1 is "+s1);
        System.out.println("String2 is "+s2);
        System.out.println("Resultant string2 is : " + result);
    }

    // Function to remove characters from string2 that are present in string1.
    private static String removeCharacter(String s1, String s2) {
        // Convert both strings to lowercase to handle case insensitivity.
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Initialize an array to keep track of characters from 'a' to 'z'.
        boolean[] presentInString2 = new boolean[26];

        // Iterate over each character in string2.
        for (char c : s2.toCharArray()) {
            // Calculate the index for the character in the boolean array and mark it as true.
            presentInString2[c - 'a'] = true;
        }

        // Use StringBuilder to construct the resulting string.
        StringBuilder result = new StringBuilder();

        // Iterate over each character in string1.
        for (char c : s1.toCharArray()) {
            // Calculate the index for the character in the boolean array.
            // If the character is not present in the boolean array, append it to the result.
            if (!presentInString2[c - 'a']) {
                result.append(c);
            }
        }

        // Return the final resulting string.
        return result.toString();
    }
}
