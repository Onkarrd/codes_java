package strings.easy;

public class PalindromeString {

  public static void main(String[] args) {
    System.out.println(new PalindromeString().palindromeCheck("hannah"));
  }

  public boolean palindromeCheck(String s) {
    int start = 0, end = s.length() - 1;
    while (start < end) {
      if (s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
