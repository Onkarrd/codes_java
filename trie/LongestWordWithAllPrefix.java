package trie;

import java.util.HashMap;

//https://www.naukri.com/code360/problems/complete-string_2687860?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_tries_videos
public class LongestWordWithAllPrefix {

  public static String completeString(int n, String[] a) {
    String completeString = "";
    HashMap<String, Integer> mp = new HashMap<>();
    for (String s : a) {
      mp.put(s, 1);
    }
    for (String s : a) {
      String pre = "";
      boolean flag = true;
      for (int i = 0; i < s.length(); i++) {
        pre += s.charAt(i);
        if (mp.containsKey(pre))
          ;
        else {
          flag = false;
          break;
        }
      }
      if (flag) {
        if (s.length() > completeString.length()) {
          completeString = s;
        } else if (s.length() > completeString.length() && s.compareTo(completeString) < 0) {
          completeString = s;
        }
      }
    }
    return completeString.isEmpty() ? "None" : completeString;
  }

  public static void main(String[] args) {
    String aa = "n l i um ar xcfyc";
    String[] a = aa.split(" ");
    System.out.println(completeString(5, a));
  }
}
