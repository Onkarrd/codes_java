package recursion;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println("isPalindrome : " + palindromeCheck("AAAAAAAAAABAAAAAAAAA"));
  }

  public static boolean palindromeCheck(String s) {
    return isPalindrome(s, 0, s.length() - 1);
  }

  private static boolean isPalindrome(String s, int left, int right) {
    if (left >= right) {
      return true;
    }
    if (s.charAt(left) != s.charAt(right)) {
      return false;
    }
    return isPalindrome(s, left + 1, right - 1);
  }
}
