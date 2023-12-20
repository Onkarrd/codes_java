package strings;

/**
 * https://leetcode.com/problems/is-subsequence/
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
 * the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence
 * of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc" Output: true Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc" Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100 0 <= t.length <= 104 s and t consist only of lowercase English letters.
 * <p>
 * <p>
 * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one
 * to see if t has its subsequence. In this scenario, how would you change your code?
 */
public class Subsequence {

  public boolean isSubsequence(String s, String t) {
    char[] chars = t.toCharArray();
    char[] seq = s.toCharArray();
    int i = 0;
    if (seq.length == 0) {
      return true;
    }
    for (char c : chars) {
      if (i == seq.length) {
        break;
      }
      if (c == seq[i]) {
        i++;
      }
    }
    return seq.length == i;
  }

  public static void main(String[] args) {
    System.out.println(new Subsequence().isSubsequence("b", "abc"));
  }

}
