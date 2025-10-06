package util;

import java.util.Scanner;

public class PowerCalculator {

  public static long power(int m, int n) {
    long result = 1;
    long base = m;

    while (n > 0) {
      if ((n & 1) == 1) {   // if n is odd
        result *= base;
      }
      base *= base;
      n >>= 1;              // divide n by 2
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter base (m): ");
    int m = sc.nextInt();

    System.out.print("Enter exponent (n): ");
    int n = sc.nextInt();

    System.out.println(m + " to the power " + n + " = " + power(m, n));
  }
}
