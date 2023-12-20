package java8;

@FunctionalInterface
interface Test {

  default void m1() {
    System.out.println("from m1");
  }

  default void m2() {
    System.out.println("from m2");
  }

  default void m3() {
    System.out.println("from m3");
  }

  default void m4() {
    System.out.println("from m4");
  }

  default void m5() {
    System.out.println("from m5");
  }

  static void m11() {
    System.out.println("from m11");
  }

  static void m12() {
    System.out.println("from m12");
  }

  static void m13() {
    System.out.println("from m13");
  }

  public abstract void am1();
}

public class TestDefaultAndStaticMethods {

  public static void main(String[] args) {

    Test t = () -> {
      System.out.println("from am1");
    };
    t.am1();
    t.m1();
    t.m2();
    t.m3();
    t.m4();
    t.m5();
    Test.m11();
    Test.m12();
    Test.m13();
  }
}