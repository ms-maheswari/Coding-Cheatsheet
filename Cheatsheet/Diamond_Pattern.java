
import java.io.*;
import java.util.Scanner;

// Main class
public class Diamond_Pattern {

	// Main driver method
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();

		// Outer loop for to print upper pyramid
		for(int i=0;i<n;i++){
			// Inner for loop to print the spaces
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}

			// Inner for loop to print the stars
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			// To start in new line
			System.out.println();
			
		}

		// Outer loop for print lower pyramid

		for(int i=0;i<n-1;i++){
			// Inner loop to print the space
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			// Inner loop to print the stars
			for(int j=0;j<n-i-1;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
