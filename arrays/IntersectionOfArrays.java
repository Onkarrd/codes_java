package arrays;

import java.util.Arrays;

public class IntersectionOfArrays {

  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5, 6, 7, 10};
    int[] a2 = {1, 13, 3, 4, 5, 6, 17, 11};
    Arrays.stream(a1).forEach(e -> {
      Arrays.stream(a2).forEach(e2 -> {
        if (e == e2) {
          System.out.println(e2);
        }
      });
    });
  }
}