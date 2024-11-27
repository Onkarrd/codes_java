package strings.easy;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaximumWordsInSentences {

  public static void main(String[] args) {
    System.out.println(new MaximumWordsInSentences().mostWordsFound(
        new String[]{"please wait", "continue to fight re", "continue to win"}));
  }

  public int mostWordsFound(String[] sentences) {
    int count = 0;
    for (String s : sentences) {
      if (s.split(" ").length > count) {
        count = s.split(" ").length;
      }
    }
    return count;
  }
}
