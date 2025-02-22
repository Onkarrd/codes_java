import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.ArrayUtil;

public class Demo {


  public static void main(String[] args) {
    int i = 1;
    printOneToN(1, 10);
  }

  public static void printOneToN(int i, int n) {
    if (i > n) {
      return;
    }
    printOneToN(i + 1, n);
    System.out.println(i);
  }

}
