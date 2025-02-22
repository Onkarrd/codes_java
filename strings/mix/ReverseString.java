package strings.mix;

import java.util.Vector;

public class ReverseString {

  public static void main(String[] args) {
    Vector<Character> s = new Vector<>();
    s.add('O');
    s.add('n');
    s.add('k');
    s.add('a');
    s.add('r');
    System.out.println(s);
    new ReverseString().reverseString(s);
  }

  public void reverseString(Vector<Character> s) {
    int start = 0, end = s.size() - 1;
    while (start < end) {
      char temp = s.get(start);
      s.set(start, s.get(end));
      s.set(end, temp);
      start++;
      end--;
    }
  }
}
