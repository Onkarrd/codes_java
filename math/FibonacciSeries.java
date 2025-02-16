package math;

public class FibonacciSeries {

  public void fib(int num) {
    if (num < 0) {
      System.out.println(-1);
    }
    if (num <= 1) {
      if (num == 0) {
        System.out.println(num);
      } else {
        System.out.println(0);
        System.out.println(1);
      }
      return;
    } else {
      System.out.println(0);
      System.out.println(1);
    }
    int sum = 0;
    int f1 = 0;
    int f2 = 1;

    for (int i = 1; i < num; i++) {
      sum = f1 + f2;
      System.out.println(sum);
      f1 = f2;
      f2 = sum;
    }
  }

  public static void main(String[] args) {
    new FibonacciSeries().fib(6);
  }
}
