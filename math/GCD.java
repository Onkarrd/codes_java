package math;

public class GCD {

  public static void main(String[] args) {
    System.out.println(gcd(9, 12));
  }

  public static int gcd(int n1, int n2) {
    while (n1 > 0 && n2 > 0) {
      if (n1 > n2) {
        n1 = n1 % n2;
      } else {
        n2 = n2 % n1;
      }
    }
    if (n1 == 0) {
      return n2;
    } else {
      return n1;
    }
  }

}
