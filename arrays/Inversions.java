package arrays;

/**
 * <pre>
 * Problem Statement Detailed explanation ( Input/output format, Notes, Constraints, Images )
 * Sample Input 1 :
 * 3
 * 3 2 1
 * Sample Output 1 : 3
 * Explanation Of Sample Output 1: We have a total of 3 pairs which satisfy the condition of inversion. (3, 2), (2, 1) and (3, 1).
 * Sample Input 2 :
 * 5
 * 2 5 1 3 4
 * Sample Output 2 : 4 Explanation Of Sample Output 2: We have a total of 4 pairs which satisfy the condition of inversion. (2, 1), (5, 1), (5, 3) and (5, 4).
 * </pre>
 */
public class Inversions {

  public static long getInversions(long arr[], int n) {
    int inversions = 0;
    int elem = 0;
    while (elem < n - 1) {
      for (int i = elem + 1; i < n; i++) {
        if (arr[elem] > arr[i]) {
          inversions++;
        }
      }
      elem++;
    }
    return inversions;
  }

  public static void main(String[] args) {
    long[] input = {3, 2, 1};
    System.out.println(getInversions(input, 3));
  }
}
