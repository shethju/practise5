package lc75;

import java.util.HashSet;
import java.util.Set;
// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> setNums = new HashSet<>();
    for (int i=0; i < nums.length; i++) {
      if (setNums.contains(nums[i])) return true;
      setNums.add(nums[i]);
    }
    return false;
  }
}
