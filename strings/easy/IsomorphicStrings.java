package strings.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 * <p>
 * 205. Isomorphic Strings Easy 5.8K 1.1K Companies Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No
 * two characters may map to the same character, but a character may map to itself.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add" Output: true Example 2:
 * <p>
 * Input: s = "foo", t = "bar" Output: false Example 3:
 * <p>
 * Input: s = "paper", t = "title" Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 104 t.length == s.length s and t consist of any valid ascii character.
 */

public class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {
    Map m = new HashMap();
    for (Integer i = 0; i < s.length(); ++i) {
      if (m.put(s.charAt(i), i) != m.put(t.charAt(i) + "t", i)) {
        return false;
      }
    }
    return true;
  }

  public boolean isomorphicString(String s, String t) {
    // Arrays to store the last seen positions of characters in s and t
    int[] m1 = new int[256], m2 = new int[256];

    // Length of the string
    int n = s.length();

    // Iterate through each character in the strings
    for (int i = 0; i < n; ++i) {
      // If the last seen positions of the current characters don't match, return false
      if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
        return false;
      }

      // Update the last seen positions255 = 0
      m1[s.charAt(i)] = i + 1;
      m2[t.charAt(i)] = i + 1;
    }

    // If all characters match, return true
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new IsomorphicStrings().isIsomorphic("egg", "add"));
    System.out.println(new IsomorphicStrings().isomorphicString("egg", "add"));

  }
}
