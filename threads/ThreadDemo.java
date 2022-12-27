package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

  public static void main(String[] args) {
    List<Integer> n1 = new ArrayList<>();
    n1.add(11);
    n1.add(12);
    n1.add(13);
    n1.add(14);
    List<Integer> n2 = new ArrayList<>();
    n2.add(1);
    n2.add(2);
    n2.add(3);
    n2.add(4);
    List<Integer> n3 = new ArrayList<>();
    n3.add(5);
    n3.add(6);
    n3.add(7);
    n3.add(8);
    List<Integer> n4 = new ArrayList<>();
    n4.add(9);
    n4.add(10);
    n4.add(11);
    n4.add(12);
    MultiThreading m1 = new MultiThreading(n1);
    MultiThreading m2 = new MultiThreading(n2);
    MultiThreading m3 = new MultiThreading(n3);
    MultiThreading m4 = new MultiThreading(n4);

    m1.start();
    m2.start();
    m3.start();
    m4.start();
  }

}
