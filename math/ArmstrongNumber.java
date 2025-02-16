package math;

public class ArmstrongNumber {

  public static void main(String[] args) {
    System.out.println(new ArmstrongNumber().isArmstrong(1634));
  }

  public boolean isArmstrong(int n) {
    int sum = 0;
    int original = n;
    int count = (int) Math.log10(n) + 1;
    while (n > 0) {
      int rem = n % 10;
      sum += Math.pow(rem, count);
      n /= 10;
    }
    return sum == original;
  }
}
