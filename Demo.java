public class Demo {

  public static boolean isSubsequence(String s, String t) {
    int count = 0;
    if (s.length() == 0) {
      return true;
    }
    char[] sa = s.toCharArray();
    char[] ta = t.toCharArray();
    for (int i = 0; i < t.length(); i++) {
      if (ta[i] == sa[count]) {
        count++;
      }
      if (count == s.length()) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isSubsequence("abc", "ahbgdc"));
  }
}
