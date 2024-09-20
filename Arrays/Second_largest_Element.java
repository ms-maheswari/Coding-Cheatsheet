package Arrays;
public class Second_largest_Element {
    public static void main(String[] args) {
        int array[] = {2, 4, 5, 6, 8};
        int n = array.length;
        // Call the Second_largest method to find the second largest element
        
        int second_lg = Second_largest(array, n);
        System.out.println("\nSecond largest element is "+ second_lg);
    }
    
    public static int Second_largest(int[] array, int n) {
        int large = array[0];
        int second_lg = Integer.MIN_VALUE;
    
        // Iterate through the array to find the second largest element
        for(int i=0;i<n;i++){
            if(array[i]>large){
                second_lg = large;
                large = array[i];
            }
            else if(array[i] > second_lg && array[i] != large){
                second_lg = array[i];
            }
        }
        return second_lg;
    }
}

// Input : array[] = {2, 4, 5, 6, 8}

// Output : Second largest element is 6