package java.binary_search;

public class KokoEatingBanana {


  public static void main(String[] args) {
    int[] piles = {7, 15, 6, 3};
    int h = 8;
    System.out.println(new KokoEatingBanana().minimumRateToEatBananas(piles, h));
  }

  public int minimumRateToEatBananas(int[] piles, int h) {

    int low = 0, high = findMax(piles), ans = Integer.MIN_VALUE;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (getTotalHours(piles, mid) <= h) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  private int findMax(int[] v) {
    int maxi = Integer.MIN_VALUE;
    int n = v.length;

    // Find the maximum element
    for (int i = 0; i < n; i++) {
      maxi = Math.max(maxi, v[i]);
    }
    return maxi;
  }

  static int getTotalHours(int[] piles, int hourly) {
    int totalHour = 0;
    for (int i = 0; i < piles.length; i++) {
      totalHour += (int) Math.ceil((double) piles[i] / (double) hourly);
    }
    return totalHour;
  }
}
