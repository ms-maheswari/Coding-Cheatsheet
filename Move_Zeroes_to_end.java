public class Move_Zeroes_to_end {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,5,0,4};
        int n = arr.length;
        int[] result = pushZerosToEnd(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
        
    }

    // Method to move zeroes to end
    
    static int[] pushZerosToEnd(int[] arr, int n) {
        int nonZeroIndex = 0;

       // Traverse the array and move non-zero elements to the front
       for (int i = 0; i < n; i++) {
           if (arr[i] != 0) {
               arr[nonZeroIndex] = arr[i];
               nonZeroIndex++;
           }
       }

       // Fill the remaining elements with zeros
       for (int i = nonZeroIndex; i < n; i++) {
           arr[i] = 0;
       }
       return arr;
   }
}
