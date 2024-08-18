package exception_handling;

public class NestedTry {

  public static void main(String[] args) {
    try {
      System.out.println("outer try");
      try {
        System.out.println("inner try");
        int a = 10 / 0;
      } catch (NullPointerException e) {

      } finally {
        System.out.println("inner finally");
      }
    } catch (ArithmeticException e) {
      System.out.println("outer catch");
    } finally {
      System.out.println("outer finally");
    }
  }
}
