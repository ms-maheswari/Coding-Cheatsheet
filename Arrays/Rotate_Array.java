package Arrays;

// Approach : Using  "Reversal Algorithm"

// For Rotating Elements to left

public class Rotate_Array{
    // To Reverse the array
    public static void Reverse(int[] arr, int start, int end) {
      while (start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    // To Rotate k elements to left
    public static void Rotateeletoleft(int[] arr, int n, int k) {

      Reverse(arr, 0, k - 1);
      Reverse(arr, k , n - 1);
      Reverse(arr, 0, n - 1);
    }
    public static void main(String args[]) {
      int[] arr = {3,7,8,9,10,11};
      int n = 6;
      int k = 3;
      Rotateeletoleft(arr, n, k);
      System.out.print("After Rotating the k elements to left ");
      for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  }


// Example:
// Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
// Output: 9 10 11 3 7 8
// Explanation: Array is rotated to right by 3 position.