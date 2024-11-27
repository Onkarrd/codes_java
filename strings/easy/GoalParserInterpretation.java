package strings.easy;

//https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {

  public static void main(String[] args) {
    System.out.println(new GoalParserInterpretation().interpret("G()(al)"));
  }

  public String interpret(String command) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == 'G') {
        sb.append('G');
      }
      if (command.charAt(i) == '(') {
        if (command.charAt(i + 1) == ')') {
          sb.append("o");
          i++;
        } else {
          sb.append("al");
          i = i + 3;
        }
      }
    }
    return sb.toString();
  }
}

