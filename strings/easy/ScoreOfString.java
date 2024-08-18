package strings.easy;

//https://leetcode.com/problems/score-of-a-string/description/
public class ScoreOfString {

  public static void main(String[] args) {
    int score = new ScoreOfString().scoreOfString("hello");
    System.out.println("score is : " + score);
  }

  public int scoreOfString(String s) {
    int score = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      score += Math.abs(s.charAt(i) - s.charAt(i + 1));
    }
    return score;
  }
}
