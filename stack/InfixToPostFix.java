package stack;

import java.util.Stack;

public class InfixToPostFix {

  private StringBuilder postfixExp = new StringBuilder();

  public static void main(String[] args) {
    String exp = "a/z+c*d-e*f*g";
    String postfixExp = new InfixToPostFix().convertToPostfix(exp);
    System.out.println(postfixExp);
  }

  private String convertToPostfix(String exp) {
    char[] expChars = exp.toCharArray();
    Stack<Operator> stack = new Stack<>();
    for (char ch : expChars) {
      if (Character.isAlphabetic(ch)) {
        postfixExp.append(ch);
      } else {
        int precedence = ch == '+' || ch == '-' ? 1 : 2;
        Operator newOp = new Operator(ch, precedence);
        evaluateStack(stack, precedence, newOp);
      }
    }
    while (!stack.isEmpty()) {
      postfixExp.append(stack.pop().op);
    }
    return postfixExp.toString();
  }

  private void evaluateStack(Stack<Operator> stack, int precedence, Operator newOp) {
    if (stack.isEmpty() || stack.peek().precedence < precedence) {
      stack.push(newOp);
      return;
    } else {
      Operator o = stack.pop();
      postfixExp.append(o.op);
      evaluateStack(stack, precedence, newOp);
    }
  }

  class Operator {

    char op;
    int precedence;

    public Operator(char op, int precedence) {
      this.op = op;
      this.precedence = precedence;
    }
  }
}
