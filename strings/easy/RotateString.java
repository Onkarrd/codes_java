package strings.easy;

import arrays.sortings.SortChars;

public class RotateString {

  public static void main(String[] args) {
    System.out.println(new RotateString().rotateString("abcd", "dabc"));
  }

  public boolean rotateString(String s, String goal) {

    int n = s.length() - 1;
    if (s.equals(goal)) {
      return true;
    }
    for (int i = 0; i < s.length(); i++) {
      char[] sChars = s.toCharArray();
      char temp = sChars[0];
      for (int j = 1; j < sChars.length; j++) {
        sChars[j - 1] = sChars[j];
      }
      sChars[sChars.length - 1] = temp;
      s = String.valueOf(sChars);
      if (s.equals(goal)) {
        return true;
      }
    }
    return false;
  }
}
