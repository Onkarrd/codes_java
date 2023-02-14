package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Is Subsequence Easy 6.6K 373 Companies Given two strings s and t, return true if s is a subsequence of t, or false
 * otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
 * the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence
 * of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc" Output: true
 * <p>Example 2:
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
class SubSequence {

  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrIdx = 0, seqIdx = 0;
    while (arrIdx < array.size() && seqIdx < sequence.size()) {
      if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
        seqIdx++;
      }
      arrIdx++;
    }
    return seqIdx == sequence.size();
  }

  public static void main(String[] args) {
    List<Integer> array = Arrays.asList(1, 2, 3, 4);
    List<Integer> sequence = Arrays.asList(1);

    System.out.println(isValidSubsequence(array, sequence));
  }
}

