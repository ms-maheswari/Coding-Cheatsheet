// Find Element Appears Once
public class Element_occurs_once {
    static class Solution {
        public int singleNonDuplicate(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                ans ^= nums[i]; // XOR 
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8}; 
        Solution solution = new Solution();
        int result = solution.singleNonDuplicate(nums);
        System.out.println("Single non-duplicate element: " + result);
    }
}

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

