package strings.easy;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValueOfVariableAfterPerformingOperations {

  public static void main(String[] args) {
    System.out.println(new FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations(
        new String[]{"++x", "x++", "x--", "x--"}));
  }

  public int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (String s : operations) {
      if (s.contains("++")) {
        x++;
      }
      if (s.contains("--")) {
        x--;
      }
    }
    return x;
  }
}
