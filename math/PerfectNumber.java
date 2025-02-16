package math;

public class PerfectNumber {

  public static void main(String[] args) {
    System.out.println(new PerfectNumber().isPerfect(28));
  }

  public boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum == n;
  }

}
