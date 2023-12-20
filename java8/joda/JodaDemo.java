package java8.joda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JodaDemo {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate endDate = LocalDate.of(2023, 11, 3);
    System.out.println(ChronoUnit.DAYS.between(today, endDate) + " days");
  }
}
