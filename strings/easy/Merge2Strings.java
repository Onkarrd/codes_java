package strings.easy;

public class Merge2Strings {

  public String mergeAlternately(String word1, String word2) {
    String merged = "";
    int w1 = 0, w2 = 0;
    while (w1 < word1.length() || w2 < word2.length()) {
      if (w1 < word1.length()) {
        if (w2 < word2.length()) {
          merged += word1.charAt(w1);
          w1++;
        } else {
          merged += word1.substring(w1 - 1);
          break;
        }
      }
      if (w2 < word2.length()) {
        if (w1 < word1.length()) {
          merged += word2.charAt(w2);
          w2++;
        } else {
          merged += word2.substring(w2 - 1);
          break;
        }
      }
    }
    return merged;
  }

  public static void main(String[] args) {
    String word1 = "abc";
    String word2 = "pqr";
    System.out.println(new Merge2Strings().mergeAlternately(word1, word2));
  }
}
