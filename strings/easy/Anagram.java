package strings.easy;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(new Anagram().anagramStrings("tea", "eaat"));
  }

  public boolean anagramStrings(String s, String t) {
    int m = s.length(), n = t.length();
    if (m != n) {
      return false;
    }
    char[] count = new char[26];
    for (int i = 0; i < m; i++) {
      count[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < n; i++) {
      count[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      if (count[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
