package exception_handling;

public class TryFinallyReturn {

  public static void main(String[] args) {
    try {
      System.out.println("try");
      int a = 10 / 0;
      return;
    } catch (Exception e) {
      System.out.println("catch");
      return;
    } finally {
      System.out.println("finally");
    }
  }
}
