package java.arrays.hard;

public class MaximumProduct {

  public static void main(String[] args) {
    System.out.println(new MaximumProduct().maxProduct(new int[]{4, 5, 3, 7, 1, 2}));
  }

  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE, n = nums.length;
    int prefix = 1, suffix = 1;
    for (int i = 0; i < n; i++) {
      if (prefix == 0) {
        prefix = 1;
      }
      if (suffix == 0) {
        suffix = 1;
      }
      prefix *= nums[i];
      suffix *= nums[n - i - 1];
      max = Math.max(max, Math.max(prefix, suffix));
    }
    return max;
  }
}
