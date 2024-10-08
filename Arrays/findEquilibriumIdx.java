package Arrays; 
class findEquilibriumIdx {
  public static int EquilibriumIdx(int nums[], int n) {
    int leftSum, rightSum;
 
    for (int i = 0; i < n; i++) {
      leftSum = 0;
      for (int j = 0; j < i; j++) {
        leftSum += nums[j];
      }
      rightSum = 0;
      for (int j = i + 1; j < n; j++) {
        rightSum += nums[j];
      }
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int n = 5;
    int nums[] = { 2, 3, -1, 8, 4};
    int equilibriumidx = EquilibriumIdx(nums, n);
    System.out.println(equilibriumidx);
 
  }
}


// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4