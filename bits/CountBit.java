package bits;

public class CountBit {

  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    return Integer.bitCount(n);
  }

  public static void main(String[] args) {
    System.out.println(new CountBit().hammingWeight(0b000000000000111));
  }
}