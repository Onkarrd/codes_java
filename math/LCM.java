package math;

public class LCM {

  public static void main(String[] args) {
    System.out.println(new LCM().LCM(4, 6));
  }

  public int LCM(int n1, int n2) {
    return n1 * n2 / GCD.gcd(n1, n2);
  }
}


