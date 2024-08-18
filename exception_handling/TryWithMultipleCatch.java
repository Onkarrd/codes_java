package exception_handling;

public class TryWithMultipleCatch {

  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException ae) {

    } catch (Exception e) {

    }
  }
}
