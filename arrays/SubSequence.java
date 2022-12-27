package arrays;

import java.util.Arrays;
import java.util.List;

class SubSequence {

  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrIdx = 0, seqIdx = 0;
    while (arrIdx < array.size() && seqIdx < sequence.size()) {
      if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
        seqIdx++;
      }
      arrIdx++;
    }
    return seqIdx == sequence.size();
  }

  public static void main(String[] args) {
    List<Integer> array = Arrays.asList(1, 2, 3, 4);
    List<Integer> sequence = Arrays.asList(1);

    System.out.println(isValidSubsequence(array, sequence));
  }
}

