// Count the number of possible triangles
import java.util.Arrays;

public class TriangleCount {
    static int NumberOfTriangles(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i > 1; i--) {
            int l = 0;
            int r = i - 1;

            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    count += (r - l);
                    r--;
                } else {
                    l++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 9, 7, 8}; // Example array
        int n = arr.length;
        int numberOfTriangles = NumberOfTriangles(arr, n);
        System.out.println("Number of triangles: " + numberOfTriangles);
    }
}


// Number of triangles: 10