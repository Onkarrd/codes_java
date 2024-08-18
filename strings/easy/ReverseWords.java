package strings.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class ReverseWords {

  public String reverseWords(String s) {
    String[] strings = s.trim().split(" ");
    int start = 0, end = strings.length - 1;
    while (start < end) {

      String temp = strings[start].trim();
      strings[start] = strings[end].trim();
      strings[end] = temp;
      start++;
      end--;
    }
    String reverse = "";
    for (String str : strings) {
      if (!str.isEmpty())
        reverse += " " + str;
    }
    return reverse.trim();
  }

  public static void main(String[] args) {
    String s = "a good   example";
    System.out.println(new ReverseWords().reverseWords(s));
  }
}
