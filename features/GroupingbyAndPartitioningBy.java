package features;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

import util.Employee;
import util.MyUtil;

public class GroupingbyAndPartitioningBy {

  public static void main(String[] args) {
    List<Employee> employees = MyUtil.getEmployees(6);

    Map<String, Long> collect = employees.stream()
        .collect(groupingBy(Employee::getName, counting()));
    System.out.println(collect);
  }
}
