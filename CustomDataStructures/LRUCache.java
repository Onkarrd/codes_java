package CustomDataStructures;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

  public static void main(String[] args) {
    Cache lru = new Cache(3);
    lru.put(1, "A");
    lru.put(2, "B");
    lru.put(3, "C");
    lru.display();
    System.out.println("-------------------");

    lru.get(2);
    lru.display();
    System.out.println("-------------------");
    lru.put(4, "D");
    lru.display();
    System.out.println("-------------------");

    lru.get(1);
    lru.display();
    System.out.println("-------------------");
    lru.put(5, "E");
    lru.display();
    System.out.println("-------------------");


  }
}

class Cache {

  Map<Integer, Node> lookUp = new HashMap<>();
  Node head = new Node(0, "");
  Node tail = new Node(0, "");
  int capacity;

  class Node {

    Node prev, next;
    int key;
    String value;

    public Node(int key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  public Cache(int capacity) {
    this.capacity = capacity;
    head.next = tail;
    tail.prev = head;
  }

  public String get(int key) {
    if (!lookUp.containsKey(key)) {
      return null;
    }
    Node node = lookUp.get(key);
    remove(node);
    insert(node);
    return node.value;
  }

  public void put(int key, String value) {
    if (lookUp.size() == capacity) {
      remove(tail.prev);
    }
    Node n = new Node(key, value);
    insert(n);
  }

  public void insert(Node n) {
    lookUp.put(n.key, n);
    Node headNext = head.next;
    head.next = n;
    n.prev = head;
    headNext.prev = n;
    n.next = headNext;
  }

  public void remove(Node node) {
    lookUp.remove(node.key);
    node.next.prev = node.prev;
    node.prev.next = node.next;
  }

  public void display() {
    lookUp.forEach((k, v) -> {
      System.out.println(k + " : " + v.value);
    });
  }
}
