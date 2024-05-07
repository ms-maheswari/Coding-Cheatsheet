public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};

        // Call the function to find the single number and print the result
        int result = singleNumber(nums);
        System.out.print("The number that appears once is "+result);
    }
    public static int singleNumber(int[] nums) {
        int once = 0;
        int twice = 0;

         
         // Iterate through each number in the array
        for (int num : nums) {
            // Update 'once' to reflect the current number's presence
            // XOR the current number with 'once', then AND with the negation of 'twice'
            once = (once ^ num) & ~twice;
            
            // Update 'twice' to reflect the current number's presence
            // XOR the current number with 'twice', then AND with the negation of 'once'
            twice = (twice ^ num) & ~once;
        }
        
        // Return the number that appears once
        return once;
    }
}


// Output

// The number that appears once is 99