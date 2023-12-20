package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Find most frequently occurring word(s) along with its frequency in given statement Example Input: "Onkar is employee
 * of Oracle company, ONKAR is from Bangalore, ONKAR! is good in java." Output: Onkar - 3 is  - 3
 */
public class FrequentWord {


  public static void main(String[] args) throws Exception {
    String input = "Onkar is employee of Oracle company, ONKAR is from Bangalore, ONKAR! is good in java.";
    String[] inputChars = input.split(" ");
    int maxFreq = 0;
    Map<Emp, Emp> freqWords = new HashMap<>();
    for (int i = 0; i < inputChars.length; i++) {
      String word = inputChars[i];
      if (word.contains("!") || word.contains(",") || word.contains("?") || word.contains(".")) {
        word = word.replace("!", "").replace(",", "").replace("?", "").replace(".", "");
      }
      Emp e = new Emp(word);
      if (freqWords.containsKey(e)) {
        e = freqWords.get(e);
        e.setFreq(e.getFreq() + 1);
      } else {
        e.setFreq(1);
        freqWords.put(e, e);
      }
      if (e.freq >= maxFreq) {
        maxFreq = e.freq;
      }
    }
    int finalMaxFreq = maxFreq;

    Set<Emp> emps = freqWords.keySet().stream().filter(s -> s.freq == finalMaxFreq).collect(Collectors.toSet());
    emps.forEach(e -> {
      System.out.println(e.name + " : " + e.freq);
    });
  }

}

class Emp {

  String name;

  public int getFreq() {
    return freq;
  }

  public void setFreq(int freq) {
    this.freq = freq;
  }

  int freq;

  public Emp(String word) {
    this.name = word;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emp emp = (Emp) o;
    return name.equalsIgnoreCase(emp.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name.toLowerCase());
  }
}

