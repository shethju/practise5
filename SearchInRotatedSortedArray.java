package lc75;

public class SearchInRotatedSortedArray {
  public static void main(String[] args) {
    int[] nums = {4,5,6,7,0,1,2,3};
    int[] nums1 = {7,0,1,2,3};
    int[] nums2 = {4,5,6,0};
    int target = 7;
    System.out.println(search(nums, 0));
    for (int i = 0; i < nums.length; i++) {
      System.out.println(search(nums, nums[i]));
    }
  }

  public static int search(int[] nums, int target) {
    if (nums.length == 0) return -1;
    //if (nums.length == 1) return nums[0];
    int high = nums.length -1;
    int low = 0;
    int mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (nums[mid] == target) return mid;
      if (nums[low] < nums[mid]) {
        if (target < nums[mid] )
        if (target < nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}
