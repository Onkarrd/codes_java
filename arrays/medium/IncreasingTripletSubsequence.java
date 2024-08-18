package arrays.medium;

//https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

public class IncreasingTripletSubsequence {

  public static void main(String[] args) {
    System.out.println(
        new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 5, 0, 1, 2, 1}));//20, 100, 10, 12, 5, 13
  }

  public boolean increasingTriplet(int[] nums) {
    int max1 = Integer.MAX_VALUE;
    int max2 = Integer.MAX_VALUE;
    for (int n : nums) {
      if (n <= max1) {
        max1 = n;
      } else if (n <= max2) {
        max2 = n;
      } else {
        return true;
      }
    }
    return false;
  }
}
