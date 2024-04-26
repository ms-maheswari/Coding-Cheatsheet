//  Sort the odd numbers of array in ascending order and even numbers in descending order

import java.util.Arrays;

public class Sort_in_Specific_Order {
    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        int n = arr.length;

        int[] result = SpecificSort(arr, n);
        // Print the sorted array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Method to sort odd numbers in descending order and even numbers in ascending order
    private static int[] SpecificSort(int[] arr, int n) {
        // Declare and initialize arrays to store odd and even numbers
        int[] oddArray = new int[n];
        int[] evenArray = new int[n];

        // Initialize counts for odd and even numbers
        int odd_Count = 0;
        int even_Count = 0;

        // Iterate through the array to separate odd and even numbers
        for (int nums : arr) {
            if (nums % 2 == 0) {
                evenArray[even_Count++] = nums;
            } else {
                oddArray[odd_Count++] = nums;
            }
        }

        // Sort the oddArray elements in descending order
        sortDescending(oddArray, odd_Count);

        // Sort the evenArray elements in ascending order
        Arrays.sort(evenArray, 0, even_Count);

        // Merge the sorted arrays back into the original array
        int index = 0;
        for (int i = 0; i < odd_Count; i++) {
            arr[index++] = oddArray[i];
        }
        for (int i = 0; i < even_Count; i++) {
            arr[index++] = evenArray[i];
        }

        // Create a new array to hold both odd and even sorted numbers
        int[] res = new int[odd_Count + even_Count];

        // Copy oddArray elements into res array
        System.arraycopy(oddArray, 0, res, 0, odd_Count); 

        // Copy evenArray elements into res array
        System.arraycopy(evenArray, 0, res, odd_Count, even_Count);
        
        return res;
    }

    // Method to sort an array in descending order (using bubble sort algorithm)
    private static void sortDescending(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
