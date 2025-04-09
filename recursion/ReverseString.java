package recursion;

import java.util.Vector;

public class ReverseString {

  public static void main(String[] args) {
    Vector<Character> v = new Vector<>();
    v.addElement('O');
    v.addElement('n');
    v.addElement('k');
    System.out.println(v);
    System.out.println(new ReverseString().reverseString(v));
  }

  public Vector<Character> reverseString(Vector<Character> s) {
    return reverse(s, 0, s.size() - 1);
  }

  private Vector<Character> reverse(Vector<Character> s, int start, int end) {
    if (start >= end) {
      return s;
    }
    char temp = s.elementAt(end);
    s.setElementAt(s.elementAt(start), end);
    s.setElementAt(temp, start);
    return reverse(s, start + 1, end - 1);
  }
}
