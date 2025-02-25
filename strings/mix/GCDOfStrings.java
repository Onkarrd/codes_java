package strings.mix;

import recursion.GCD;

/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * <pre>
 *   1071. Greatest Common Divisor of Strings
 * Easy
 * 3.2K
 * 488
 * Companies
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 *
 * Constraints:
 *
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 * </pre>
 */
public class GCDOfStrings {

  public static void main(String[] args) {
    System.out.println(gcdOfStrings("ABCABCABC", "ABCABC"));
  }

  private static String gcdOfStrings(String str1, String str2) {
    int l1 = str1.length();
    int l2 = str2.length();
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }

    int gcd = new GCD().gcd(l1, l2);
    return str1.substring(0, gcd);
  }
}
