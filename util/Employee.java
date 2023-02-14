package util;

import java.util.ArrayList;
import java.util.List;

public class Employee {

  public Employee(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  private int id;
  private String name;
  private int age;

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static List<Employee> getEmployees(int count) {
    List<Employee> emlpoyees = new ArrayList<>();
    for (int j = 1; j <= count; j++) {
      emlpoyees.add(new Employee(j, j % 2 == 0 ? "Mark" : "Jack", j * 7));
    }
    return emlpoyees;
  }
}