package Arrays;

import java.util.Arrays;

public class First_missing_positive {
    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        int n = arr.length;
        first_Missing_Positive(arr, n);
    }

    public static void first_Missing_Positive(int arr[], int n) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Initialize the first missing positive number as 1
        int a = 1;
        for (int i = 0; i < n; i++) {
            // If the current element is positive and equals to the current 'a', increment 'a'
            if (arr[i] > 0 && arr[i] == a)
                a++;
        }
        System.out.print("First Missing number is " + a);
    }
}

// Input: arr[] = {3, 4, -1, 1};
// Outpu: First Missing number is 2