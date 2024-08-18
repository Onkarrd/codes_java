package arrays.searching.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

  public static void main(String[] args) {
    System.out.println(new LongestSubstringWithoutRepeatingChars().lengthOfLongestSubstring("aaaaaaaabcdefffffffffff"));
  }

  public int lengthOfLongestSubstring(String s) {
    char[] chars = s.toCharArray();
    int length, maxLength = 0;
    int p1 = 0, p2 = 0;
    Set<Character> seq = new HashSet<>();
    while (p1 < chars.length) {
      while (p2 < chars.length) {
        if (!seq.add(chars[p2++])) {
          break;
        }
      }
      if (seq.size() > maxLength) {
        maxLength = seq.size();
      }
      p1++;
      p2 = p1;
      seq = new HashSet<>();
    }
    return maxLength;
  }
}
