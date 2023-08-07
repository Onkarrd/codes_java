package features8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalDemo {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c", "d");
    System.out.println(findElement(list, "x"));
  }

  static String findElement(List<String> arr, String x) {
    return arr.stream().filter(s -> s.equals(x)).findFirst().map(String::toString).orElse("no match");
  }
}
