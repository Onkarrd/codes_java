package recursion;

import code.util.MyUtil;

public class Permutation {

  public static void main(String[] args) {
    String input = "ABCD";
    char[] chars = input.toCharArray();
    int l = 0;
    int r = input.length();
    printPermutations(chars, l, r - 1);
  }

  private static void printPermutations(char[] chars, int l, int r) {
    if (l == r) {
      System.out.println(String.valueOf(chars));
    } else {
      for (int i = l; i <= r; i++) {
        MyUtil.swap(chars, l, i);
        printPermutations(chars, l + 1, r);
        MyUtil.swap(chars, l, i);
      }
    }
  }
}
