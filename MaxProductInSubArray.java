package lc75;

public class MaxProductInSubArray {
  public int maxProduct(int[] nums) {
    if (nums.length == 0) return 0;
    int maxsofar = nums[0];
    int minsofar = nums[0];
    int result = nums[0];
    for (int i=1; i < nums.length; i++) {
      int current = nums[i];
      int tempmax = Math.max(current, Math.max(maxsofar * current, minsofar * current)); // both min/max used
      minsofar = Math.min(current, Math.min(maxsofar * current, minsofar * current)); // both min/max used
      maxsofar = tempmax; // need tempmax since both max and min used. If we had swapped above statements we
      // would need tmpmin
      result = Math.max(result, maxsofar);
    }
    return result;
  }
}
