package lc75;
// https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArryExceptSelf {
  public static void main(String[] args) {

  }

  private static int[] product(int[] input) {
    int[] result = new int[input.length];
    result[0]=1;
    for (int i=1; i < input.length; i++) {
      result[i] = result[i-1] * input[i-1];
    }
    int r = 1;
    for (int i=input.length-2; i >=0; i--) {
      r = r * input[i+1];
      result[i] = r * result[i];
    }
    return result;
  }
}
