package arrays.easy;

/**
 * https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class Flowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
      return true;
    }
    for (int i = 0; i < flowerbed.length; i++) {
      //
      if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1
          || flowerbed[i + 1] == 0)) {
        n--;
        flowerbed[i] = 1;
        if (n == 0) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] n = {0, 0, 1, 0, 0};//, 0, 0, 0, 1
    System.out.println(new Flowers().canPlaceFlowers(n, 1));
  }
}
