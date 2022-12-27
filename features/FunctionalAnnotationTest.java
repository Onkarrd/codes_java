package features;

@FunctionalInterface
interface Interface1 {

  abstract void m1();

}

public class FunctionalAnnotationTest {

  public static void main(String[] args) {
    Interface1 i1 = () -> {
      System.out.println("from m1");
    };
    i1.m1();
  }
}
