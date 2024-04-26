// Remove Duplicates
public class RemoveDuplicates {
    
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // Get the length of the modified array after removing duplicates
        int length = removeDuplicates(nums);
        System.out.print("Modified array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

// modified array after removing duplicates:{0, 1, 2, 3, 4}
