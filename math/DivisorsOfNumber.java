package math;

import java.util.Arrays;
import util.ArrayUtil;

public class DivisorsOfNumber {

  public static void main(String[] args) {
    ArrayUtil.printArray(new DivisorsOfNumber().divisors(20));
  }

  public int[] divisors(int n) {
    int[] divisors = new int[n];
    int count = 0;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 1; i <= sqrt; i++) {
      if (n % i == 0) {
        divisors[count++] = i;
        if (i != n / i) {
          divisors[count++] = n / i;
        }
      }
    }
    int[] arr = Arrays.copyOf(divisors, count);
    Arrays.sort(arr);
    return arr;
  }
}
