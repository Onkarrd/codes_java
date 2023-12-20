package java8;

import java.util.Arrays;
import java.util.List;

public class OptionalDemo {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c", "d");
    System.out.println(findElement(list, "x"));
  }

  static String findElement(List<String> arr, String x) {
    return arr.stream().filter(s -> s.equals(x)).findFirst().map(String::toString).orElse("no match");
  }
}
