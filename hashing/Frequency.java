package hashing;

public class Frequency {

  public static void main(String[] args) {
    //freqOfNumbers();
    freqOfCharacter();
  }

  private static void freqOfCharacter() {
    String s = "AAA";
    int hash[] = new int[256];
    for (Character c : s.toCharArray()) {
      hash[c] += 1;
    }
    for (int i = 0; i < hash.length; i++) {
      System.out.println(i + " : " + hash[i]);
    }
  }

  private static void freqOfNumbers() {
    int[] input = new int[]{1, 3, 4, 2, 1, 4, 2, 3, 1, 3};
    int[] hash = new int[input.length + 1];

    for (int i = 0; i < input.length; i++) {
      hash[input[i]] = hash[input[i]] + 1;
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(i + " : " + hash[i]);
    }
  }
}
