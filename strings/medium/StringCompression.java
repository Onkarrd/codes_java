package strings.medium;

public class StringCompression {

  public static void main(String[] args) {
    new StringCompression().compress("aabbccc".toCharArray());
  }

  public int compress(char[] chars) {
    int p = 1;
    if (chars.length == 0 || chars.length == 1) {
      return chars.length;
    }
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == chars[i - 1]) {

        p++;
      } else {

      }
    }
    return chars.length;
  }
}
