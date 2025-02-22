package strings.easy;

public class LargeOddNumber {

  public static void main(String[] args) {
    System.out.println(new LargeOddNumber().largeOddNum("1000000"));
  }

  public String largeOddNum(String s) {
    int start = 0, end = -1, n = s.length();
    for (int i = n - 1; i >= 0; i--) {
      if ((s.charAt(i) - '0') % 2 != 0) {
        end = i;
        break;
      }
    }
    if (end == -1) {
      return "";
    }
    while (start <= n && s.charAt(start) == '0') {
      start++;
    }
    return s.substring(start, end + 1);
  }
}
