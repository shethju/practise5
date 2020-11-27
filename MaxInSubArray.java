package lc75;

// Approach 2: Greedy
public class MaxInSubArray {
  public int maxSubArray(int[] nums) {
    if (nums.length < 0) return -1;
    int localMax = nums[0];
    int globalMax = nums[0];
    for (int i=1; i < nums.length; i++) {
      localMax = Math.max(nums[i], localMax + nums[i]); // This needs to be calculated 1st
      globalMax = Math.max(globalMax, localMax);
    }
    return globalMax;
  }
}
