package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import util.Day;

public class Demo {

  public static void main(String[] args) {
    System.out.println(Day.MONDAY.name());
    
  }

  public static int solution(int num) {
    // edge case
    if (num == 0) {
      return 0;
    }

    boolean negative = num / Math.abs(num) == -1;
    num = Math.abs(num);
    int n = num;

    int counter = 0;
    int position = 1;
    List<Integer> nums = new ArrayList<>();

    while (num > 0) {
      int digit = num % 10;
      if (digit != 5) {
        nums.add(digit);
      }
      num /= 10;
    }
    if (negative) {
      Collections.sort(nums);
    } else {
      Collections.sort(nums, Collections.reverseOrder());
    }
    int maxValue = 0;
    for (Integer digit : nums) {
      maxValue = maxValue * 10 + digit;
    }
    return maxValue;
  }
}
