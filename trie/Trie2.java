package trie;

import java.util.Arrays;

class Node2 {

  Node2[] nodes = new Node2[26];
  int endsWith;
  int countPrefix;

  @Override
  public String toString() {
    return "Node2{" +
        "nodes=" + Arrays.toString(nodes) +
        ", endsWith=" + endsWith +
        ", countPrefix=" + countPrefix +
        '}';
  }

  public int getEndsWith() {
    return endsWith;
  }

  public int getCountPrefix() {
    return countPrefix;
  }

  public void incCount() {
    endsWith++;
  }

  public void decCount() {
    endsWith--;
  }

  public void incCountPrefix() {
    countPrefix++;
  }

  public void decCountPrefix() {
    countPrefix--;
  }

  public void put(Character ch, Node2 node) {
    nodes[ch - 'a'] = node;
  }

  public boolean containsKey(char ch) {
    return nodes[ch - 'a'] != null;
  }

  public Node2 get(Character ch) {
    return nodes[ch - 'a'];
  }

}

public class Trie2 {

  //Initialize your data structure here
  public static Node2 root;

  static {
    root = new Node2();
  }

  //Inserts a word into the trie

  public static void insert(String word) {
    char[] letters = word.toCharArray();
    Node2 node = root;
    System.out.println(word);
    for (int i = 0; i < word.length(); i++) {
      if (!node.containsKey(letters[i])) {
        node.put(letters[i], new Node2());
      }
      node = node.get(letters[i]);
      node.incCountPrefix();
      System.out.println(letters[i] + " -> " + node.getCountPrefix());

    }
    node.incCount();
  }

  public static void erase(String word) {
    char[] letters = word.toCharArray();
    Node2 node = root;
    for (int i = 0; i < word.length(); i++) {
      if (node.containsKey(letters[i])) {
        node = node.get(letters[i]);
        node.decCountPrefix();
      } else {
        return;
      }
    }
    node.decCount();
  }

  //Returns if the word is in the trie

  public static int countWordsEqualTo(String word) {
    char[] letters = word.toCharArray();
    Node2 node = root;
    for (int i = 0; i < word.length(); i++) {
      if (node.containsKey(letters[i])) {
        node = node.get(letters[i]);
      } else {
        return 0;
      }
    }
    return node.getEndsWith();
  }

  //Returns if there is any word in the trie that starts with the given prefix

  public static int countWordsStartingWith(String prefix) {
    char[] letters = prefix.toCharArray();
    Node2 node = root;
    for (int i = 0; i < prefix.length(); i++) {
      if (node.containsKey(letters[i])) {
        node = node.get(letters[i]);
      } else {
        return 0;
      }
    }
    return node.getCountPrefix();
  }

}