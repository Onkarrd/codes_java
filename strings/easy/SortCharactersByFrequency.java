package strings.easy;

import java.util.*;

import util.ArrayUtil;

public class SortCharactersByFrequency {

  public static void main(String[] args) {
    System.out.println(new SortCharactersByFrequency().frequencySort("aaabbcdddd"));
  }

  public List<Character> frequencySort(String s) {
    List<Character> result = new ArrayList<>();
    Pair[] freq = new Pair[26];
    for (int i = 0; i < 26; i++) {
      freq[i] = new Pair(0, (char) (i + 'a'));
    }
    for (char c : s.toCharArray()) {
      freq[c - 'a'].freq++;
    }

    Arrays.sort(freq, (p1, p2) -> {
      if (p1.freq != p2.freq) {
        return p2.freq - p1.freq;
      }
      return p1.ch - p2.ch;
    });
    for (int i = 0; i < freq.length; i++) {
      if (freq[i].freq > 0) {
        result.add(freq[i].ch);
      }
    }
    return result;
  }

  class Pair {

    int freq;
    char ch;

    Pair(int f, char c) {
      this.freq = f;
      this.ch = c;
    }
  }

}
