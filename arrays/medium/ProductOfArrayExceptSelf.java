package arrays.medium;

import java.util.Arrays;
import util.ArrayUtil;

//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
public class ProductOfArrayExceptSelf {

  public static void
  main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    ArrayUtil.printArray(new ProductOfArrayExceptSelf().productExceptSelf(arr));
  }

  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int ans[] = new int[n];
    Arrays.fill(ans, 1);
    int curr = 1;
    for (int i = 0; i < n; i++) {
      ans[i] *= curr;
      curr *= nums[i];
    }
    curr = 1;
    for (int i = n - 1; i >= 0; i--) {
      ans[i] *= curr;
      curr *= nums[i];
    }
    return ans;
  }
}
