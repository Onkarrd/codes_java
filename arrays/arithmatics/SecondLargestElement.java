package arrays.arithmatics;

public class SecondLargestElement {

  public int secondLargestElement(int[] nums) {
    int largest = -1, secondLargestElement = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        secondLargestElement = largest;
        largest = nums[i];
      }
      if (nums[i] > secondLargestElement && nums[i] != largest) {
        secondLargestElement = nums[i];
      }
    }
    return secondLargestElement;
  }

  public static void main(String[] args) {
    System.out.println(new SecondLargestElement().secondLargestElement(new int[]{7, 7, 2, 2, 10, 10, 10}));
  }
}
