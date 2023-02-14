import static util.ArrayUtil.printArray;
import static util.ArrayUtil.swap;

import java.util.ArrayList;
import java.util.List;

public class Demo {


  public static void main(String[] args) throws Exception {
    int[] arr = {3, 1, 2, 1};
    int n = arr.length;
    int s = 2;
    int sum = 0;
    List<Integer> sequence = new ArrayList<>();
    subsequences(0, sequence, n, arr, sum, s);
  }

  private static void subsequences(int i, List<Integer> sequence, int n, int[] arr, int sum, int s) {
    
  }

}