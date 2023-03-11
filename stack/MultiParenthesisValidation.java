package stack;

public class MultiParenthesisValidation {

  public static void main(String[] args) {
    System.out.println(validate("3+3(5*[6-8])+49-{45-41/(11+2)}"));
  }

  private static boolean validate(String s) {
    char[] elems = s.toCharArray();
    char[] stack = new char[elems.length];
    int top = -1;
    String chars = "({[]})";
    for (int i = 0; i < elems.length; i++) {
      if (!chars.contains(elems[i] + "")) {
        continue;
      } else {
        if ("({[".contains(elems[i] + "")) {
          stack[++top] = elems[i];
        } else {
          if (top == -1) {
            return false;
          }
          char topElem = stack[top--];
          if (!((elems[i] == ')' && topElem == '(') || (elems[i] == ']' && topElem == '[') || (elems[i] == '}'
              && topElem == '{'))) {
            return false;
          }
        }
      }
    }
    return top == -1;
  }
}
