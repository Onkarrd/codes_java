package java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PalindromUsingStreams {

  public static void main(String[] args) {
    String s = "MADAMM";

    boolean isPalindrome = IntStream.range(0, s.length() / 2)
        .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));

    System.out.println(isPalindrome);
  }
}
