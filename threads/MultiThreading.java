package threads;

import java.util.ArrayList;
import java.util.List;

public class MultiThreading extends Thread {

  List<Integer> numbers = new ArrayList<>();

  MultiThreading(List<Integer> numbers) {
    this.numbers = numbers;
  }

  @Override
  public void run() {
    super.run();
    for (int i = 0; i < 10; i++) {
      System.out.println(
          "running thread " + this.getName() + " Processing numbers : " + numbers.toString());
      try {
        Thread.sleep(500L);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
