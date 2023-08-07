package conditionflows;

public class TryCatchFinally {

  public static void main(String[] args) {
    System.out.println(call());
  }

  public static int call() {
    try {
      System.out.println("s");
      return 1;
    } catch (Exception e) {
      return 2;
    } finally {
      return 3;
    }
  }
}
