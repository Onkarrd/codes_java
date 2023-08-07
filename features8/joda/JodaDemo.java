package features8.joda;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class JodaDemo {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate endDate = LocalDate.of(2023, 11, 3);
    System.out.println(ChronoUnit.DAYS.between(today, endDate) + " days");
  }
}
