package Arrays;
public class Kadane_Algorithm {
    public static long maxSubarraySum(int arr[], int n) {
        long max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
        long sum = 0;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add the current element to the sum
            max = Math.max(max, sum); // Update max if the current sum is greater
            if (sum < 0) {
                sum = 0; // Reset sum to 0 if it becomes negative
            }
        }
        
        return max; 
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}

//Kadane's Algorithm is used to find the maximum sum subarray in a given array.
//Input int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//Output Maximum subarray sum is: 6