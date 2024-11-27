package util;

import java.util.Random;

//  Definition for singly-linked list.
public class ListNode {

  public int val;
  public ListNode next;

  ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode populate() {
    Random r = new Random();
    ListNode node = new ListNode(r.nextInt(0, 9));
    ListNode second = new ListNode(r.nextInt(0, 9));
    ListNode third = new ListNode(r.nextInt(0, 9));
    ListNode fourth = new ListNode(r.nextInt(0, 9));
    ListNode fifth = new ListNode(r.nextInt(0, 9));

    node.next = second;
    node.next.next = third;
    node.next.next.next = fourth;
    node.next.next.next.next = fifth;
    return node;
  }

  @Override
  public String toString() {
    return "ListNode{ " + this.val + " }";
  }
}
