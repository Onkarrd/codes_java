package trie;

class Node {

  Node[] nodes = new Node[26];
  boolean isEnd;

  public boolean isEnd() {
    return isEnd;
  }

  public void setEnd() {
    isEnd = true;
  }

  public void setNode(Character ch, Node node) {
    nodes[ch - 'a'] = node;
  }

  public boolean containsKey(char ch) {
    return nodes[ch - 'a'] != null;
  }

  public Node get(Character ch) {
    return nodes[ch - 'a'];
  }

}

public class Trie {

  //Initialize your data structure here
  private static Node root;

  static {
    root = new Node();
  }

  //Inserts a word into the trie

  public static void insert(String word) {
    char[] letters = word.toCharArray();
    Node node = root;
    for (int i = 0; i < word.length(); i++) {
      if (!node.containsKey(letters[i])) {
        node.setNode(letters[i], new Node());
      }
      node = node.get(letters[i]);
    }
    node.setEnd();
  }

  //Returns if the word is in the trie

  public static boolean search(String word) {
    char[] letters = word.toCharArray();
    Node node = root;
    for (int i = 0; i < word.length(); i++) {
      if (!node.containsKey(letters[i])) {
        return false;
      }
      node = node.get(letters[i]);
    }
    return node.isEnd();
  }

  //Returns if there is any word in the trie that starts with the given prefix

  public static boolean startsWith(String prefix) {
    char[] letters = prefix.toCharArray();
    Node node = root;
    for (int i = 0; i < prefix.length(); i++) {
      if (!node.containsKey(letters[i])) {
        return false;
      }
      node = node.get(letters[i]);
    }
    return true;
  }

  public static boolean checkIfPrefixExist(String word) {
    Node node = root;
    for (int i = 0; i < word.length(); i++) {
      if (node.containsKey(word.charAt(i))) {
        node = node.get(word.charAt(i));
        if (node.isEnd == false) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Trie.insert("apple");
    System.out.println(Trie.search("apple"));
    System.out.println(Trie.startsWith("app"));
    System.out.println(Trie.startsWith("ale"));

  }
}
