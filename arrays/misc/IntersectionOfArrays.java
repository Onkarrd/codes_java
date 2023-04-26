package arrays.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class IntersectionOfArrays {

  public static void main(String[] args) {
    Integer[] a1 = {1, 2, 3, 4, 5, 6, 7, 10, 13};
    Integer[] a2 = {1, 13, 3, 4, 5, 6, 17, 11};
    printIntersection(a1, a2);
    printIntersectionWithMap(a1, a2);
  }

  private static void printIntersectionWithMap(Integer[] a1, Integer[] a2) {
    Set<Integer> intersection = new HashSet<>();
    Set<Integer> sol = new HashSet<>();
    AtomicInteger c = new AtomicInteger();
    intersection.addAll(Arrays.asList(a1));
    Arrays.stream(a2).forEach(e -> {
      c.getAndIncrement();
      boolean added = intersection.add(e);
      if (!added) {
        sol.add(e);
      }
    });
    System.out.println(sol);
    System.out.println("iterations : " + c.get());
  }

  private static void printIntersection(Integer[] a1, Integer[] a2) {
    AtomicInteger c = new AtomicInteger();
    Arrays.stream(a1).forEach(e -> {
      c.getAndIncrement();
      Arrays.stream(a2).forEach(e2 -> {
        c.getAndIncrement();
        if (e == e2) {
          System.out.print(" " + e2);
        }
      });
    });
    System.out.println("\niterations : " + c.get());
  }
}