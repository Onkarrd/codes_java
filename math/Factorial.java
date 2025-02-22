package math;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(new Factorial().factorial(13));
  }

  public long factorial(int n) {
    int fact = 1, i = 1;
    return fact(i, n, fact);
  }

  private int fact(int i, int n, int fact) {
    if (i > n) {
      return fact;
    }
    fact = fact * i++;
    return fact(i, n, fact);
  }
}
