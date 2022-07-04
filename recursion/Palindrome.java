package recursion;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println("isPalindrome : " + isPalindrome("AAAAAAAAAABAAAAAAAAA"));
  }

  private static boolean isPalindrome(String str) {
    char[] input = str.toCharArray();
    int i = 0;
    int n = str.length();
    return isPalindrome(input, i, n);
  }

  private static boolean isPalindrome(char[] input, int i, int n) {
      if (i >= n) {
          return true;
      }
      if (input[i] != input[n - i - 1]) {
          return false;
      }
    return isPalindrome(input, i + 1, n);
  }
}
