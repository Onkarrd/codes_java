package math;
//https://leetcode.com/problems/longest-palindromic-substring/

public class Palindrom {

  public boolean palindrom(int s) {
    int rev = 0;
    int given = s;
    while (s > 0) {
      int rem = s % 10;
      rev = rev * 10 + rem;
      s /= 10;
    }
    return given == rev;
  }

  public static void main(String[] args) {
    System.out.println(new Palindrom().palindrom(121));
  }

}
