package strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
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
      System.out.println(">>>>>> " + s.charAt(i) + "     " + t.charAt(i) + "        " + m);
      if (m.put(s.charAt(i), i) != m.put(t.charAt(i) + "t", i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    //System.out.println(new IsomorphicStrings().isIsomorphic("bbbaaaba", "aaabbbba"));
    Map m = new HashMap();
    System.out.println(m.put("a", 1));
    System.out.println(m.put("a", 2));
    System.out.println(m.put("a", 3));
  }
}
