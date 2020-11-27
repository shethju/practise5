package lc75;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinInRotatedSortedArray {
  public static void main(String[] args) {
    int[] nums = {4,5,6,7,0,1,2,3};
    System.out.println(findMin(nums));
  }
  public static int findMin(int[] nums) {
    if (nums.length == 0) return -1;
    if (nums.length == 1) return nums[0];
    int high = nums.length -1;
    int low = 0;
    if (nums[low] < nums[high]) return nums[low];
    int mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (nums[mid] > nums[mid+1]) {
        return nums[mid+1];
      } else if (nums[mid] < nums[mid-1]) {
        return nums[mid];
      }
      if (nums[mid] > nums[low]) {
        low = mid+1;
      } else {
        high = mid -1;
      }
    }
    return -1;
  }
}
