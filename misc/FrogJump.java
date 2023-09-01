package misc;

/**
 * leet-code 403. Frog Jump TODO
 */
public class FrogJump {

  public static void main(String[] args) {
    int[] stones1 = {0, 1, 3, 5, 6, 8, 12, 17};
    int[] stones2 = {0, 1, 2, 3, 4, 8, 9, 11};
    System.out.println(canCross(stones1));

  }

  public static boolean canCross(int[] stones) {
    boolean canCorss = false;
    int prevJump = 1;
    int nextJump = -1;
    for (int i = 1; i < stones.length - 1; i++) {
      nextJump = stones[i + 1] - stones[i];

    }

    return canCorss;
  }
}
