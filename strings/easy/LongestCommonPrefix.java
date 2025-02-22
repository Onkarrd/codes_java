package strings.easy;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] list = {"flower", "flock", "flip"};
    System.out.println(new LongestCommonPrefix().longestCommonPrefix(list));
  }

  public String longestCommonPrefix(String[] str) {
    Arrays.sort(str);
    String first = str[0], last = str[str.length - 1];
    StringBuilder prefix = new StringBuilder();
    for (int i = 0; i < Math.min(first.length() - 1, last.length() - 1); i++) {
      if (first.charAt(i) != last.charAt(i)) {
        break;
      }
      prefix.append(first.charAt(i));
    }
    return prefix.toString();
  }
}
