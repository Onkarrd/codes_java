package features8;

import java.util.List;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;
import util.Employee;

public class GroupingbyAndPartitioningBy {

  public static void main(String[] args) {
    List<Employee> employees = Employee.getEmployees(6);

    Map<Integer, Employee> map = employees.stream()
        .collect(Collectors.toMap(Employee::getId, Function.identity()));
    System.out.println(map);
  }
}
