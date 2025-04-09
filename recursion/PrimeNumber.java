package recursion;

public class PrimeNumber {

  public static void main(String[] args) {
    System.out.println(primeCheck(42));
  }

  private static boolean primeCheck(int number) {
    if (number <= 1) {
      return false;
    }
    return isPrime(2, number);
  }

  private static boolean isPrime(int i, int number) {
    if (i > Math.sqrt(number)) {
      return true;
    }
    if (number % i == 0) {
      return false;
    }
    return isPrime(i + 1, number);
  }
}
