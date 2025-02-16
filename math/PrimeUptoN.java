package math;

public class PrimeUptoN {

  public static void main(String[] args) {
    System.out.println(new PrimeUptoN().primeUptoN(10));
  }

  public int primeUptoN(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    int count = 1;
    for (int i = 3; i < n; i++) {
      boolean isPrime = true;
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        count++;
      }
    }
    return count;
  }
}
