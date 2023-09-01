package hashing;

import java.util.ArrayList;
import java.util.List;

class HashSetListIml {

  boolean[] arr;

  /**
   * Initialize your data structure here.
   */

  List<List<Integer>> set = null;
  final int bucketSize = 1000;

  public HashSetListIml() {
    set = new ArrayList<>(bucketSize);
    for (int i = 0; i < bucketSize; i++) {
      set.add(new ArrayList<>());
    }

  }

  public void add(int i) {
    int bucket = i % bucketSize;
    List<Integer> bucketList = set.get(bucket);
    if (!bucketList.contains(i)) {
      bucketList.add(i);
    }
  }

  public void remove(int i) {
    int bucket = i % bucketSize;
    List<Integer> bucketList = set.get(bucket);
    if (bucketList.contains(i)) {
      bucketList.remove((Integer) i);
    }
  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int i) {
    int bucket = i % bucketSize;
    List<Integer> bucketList = set.get(bucket);
    return bucketList.contains(i);
  }

  public static void main(String[] args) {
    HashSetListIml obj = new HashSetListIml();
    int key = 10;
    obj.add(key);
    obj.remove(key);
    boolean param_3 = obj.contains(key);
    System.out.println(param_3);
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj = new MyHashSet(); obj.add(key);
 * obj.remove(key); boolean param_3 = obj.contains(key);
 */
