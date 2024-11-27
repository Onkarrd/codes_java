package hashing;

public class FrequencyOfLetters {

  public static void main(String[] args) {
    new FrequencyOfLetters().calFreq("bajchbsjkbckjsdbkjv");
  }

  private void calFreq(String str) {
    char[] chars = str.toCharArray();
    int[] frequencies = new int[26];
    for (Character c : chars) {
      frequencies[((int) c) - 97] = frequencies[((int) c) - 97] + 1;
    }
    for (int f = 0; f < frequencies.length; f++) {
      if (frequencies[f] > 0) {
        System.out.println(((char) (f + 97)) + " : " + frequencies[f]);
      }
    }
  }
}
