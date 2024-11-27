package strings.easy;

//https://leetcode.com/problems/permutation-difference-between-two-strings/
public class PermutationDifferenceBetweenTwoStrings {

  public static void main(String[] args) {
    System.out.println(new PermutationDifferenceBetweenTwoStrings().findPermutationDifference("abc", "bac"));
  }

  public int findPermutationDifference(String s, String t) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      sum += Math.abs((int) s.indexOf(s.charAt(i)) - (int) t.indexOf(s.charAt(i)));
    }
    return sum;
  }

}
