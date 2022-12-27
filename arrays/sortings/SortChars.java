package arrays.sortings;

import java.util.HashMap;
import java.util.Map;

public class SortChars {

  public static void main(String[] args) {
    System.out.println((char) 97);
    String s = "congratulations";
    char[] chars = new char[s.length()];
    s.getChars(0, s.length(), chars, 0);
    int[] c = new int[26];
    for (char ch : chars) {
      c[ch - 97]++;
    }
    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < c[i]; j++) {
        System.out.print(((char) (97 + i)));
      }
    }
  }
}
