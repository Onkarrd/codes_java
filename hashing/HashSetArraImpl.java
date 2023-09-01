package hashing;

class HashSetArraImpl {

  boolean[] arr;

  /**
   * Initialize your data structure here.
   */
  public HashSetArraImpl() {
    arr = new boolean[1000000000];
  }

  public void add(int i) {
    arr[i] = true;
  }

  public void remove(int i) {
    arr[i] = false;
  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int i) {
    return arr[i];
  }

  public static void main(String[] args) {
    HashSetArraImpl obj = new HashSetArraImpl();
    int key = 10;
    obj.add(key);
    //obj.remove(key);
    boolean param_3 = obj.contains(key);
    System.out.println(param_3);
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj = new MyHashSet(); obj.add(key);
 * obj.remove(key); boolean param_3 = obj.contains(key);
 */
