package strings.easy;
/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
 */

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = Integer.MIN_VALUE;
    for (int candy : candies) {
      if (max < candy) {
        max = candy;
      }
    }
    List<Boolean> decisions = new ArrayList<>();
    for (int candy : candies) {
      if (candy + extraCandies >= max) {
        decisions.add(true);
      } else {
        decisions.add(false);
      }
    }
    return decisions;
  }

  public static void main(String[] args) {
    int[] n = {2, 3, 5, 1, 3};
    System.out.println(new KidsWithGreatestNoOfCandies().kidsWithCandies(n, 3));
  }
}
