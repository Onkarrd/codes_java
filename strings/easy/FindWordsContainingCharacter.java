package strings.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-words-containing-character/
public class FindWordsContainingCharacter {

  public static void main(String[] args) {
    System.out.println(new FindWordsContainingCharacter().findWordsContaining(new String[]{"leet", "code"}, 'e'));
  }

  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      if (words[i].indexOf(x) != -1) {
        list.add(i);
      }
    }
    return list;
  }

}
