package Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };
        int n = arr.length;
        int result[] = move_zeroes(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }   

    static int[] move_zeroes(int arr[], int n) {
        // Initialize the index 'j' to -1 to indicate no zero found initially
        int j = -1;

        // Iterate through the array to check for the first occurrence of a zero
        for (int i = 0; i < n; i++) {
            // When a zero is found, store its index in 'j' and exit the loop
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zeroes were found, return the original array
        if (j == -1)
           return arr;

        // If zeroes are present, swap non-zero elements with zeroes
        for (int i = j + 1; i < n; i++) {
            // If a non-zero element is found after the first zero, swap it with the element at index 'j'
            if (arr[i] != 0) {
                // Perform the swap between arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move 'j' to the next index where a zero is located
                j++;
            }
        }
        return arr;
    }
}

// Input: arr[] = {1, 0, 2, 3, 0, 4, 0, 1};
// Output: 1 2 3 4 1 0 0 0