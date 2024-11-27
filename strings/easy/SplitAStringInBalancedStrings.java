package strings.easy;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class SplitAStringInBalancedStrings {

  public static void main(String[] args) {
    System.out.println(new SplitAStringInBalancedStrings().balancedStringSplit("RLRRRLLRLL"));
  }

  public int balancedStringSplit(String s) {
    int balancedStrings = 0;
    int r = 0, l = 0;
    char[] str = s.toCharArray();
    for (int i = 0; i < str.length; i++) {
      if (str[i] == 'R') {
        r++;
      }
      if (str[i] == 'L') {
        l++;
      }
      if (r == l) {
        r = 0;
        l = 0;
        balancedStrings++;
      }
    }
    return balancedStrings;
  }
}
