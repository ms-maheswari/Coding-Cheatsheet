package Strings;
import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        
        // Split the input string by spaces
        String[] words = input.split(" ");
        
        // Reverse the order of words and store them in a new string
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
 }  
        System.out.println(reversedString.toString());
    }
}


//Input
//The mind is everything What you think you become


//output
//become you think you What everything is mind The
