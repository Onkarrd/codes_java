package java8.lamda;


interface Interf {

  static void m1() {
    System.out.println("from static method m1");
  }

  static void m2() {
    System.out.println("from static method m2");
  }

  default void m3() {
    System.out.println("from default method m3");
  }

  default void m4() {
    System.out.println("from default method m3");
  }
}

public class MultipleStaticDefaults implements Interf {

  public static void main(String[] args) {
    Interf i = new MultipleStaticDefaults();
    Interf.m1();
    Interf.m2();
  }

  public void m3() {
    System.out.println("overridden m3");
  }


}
