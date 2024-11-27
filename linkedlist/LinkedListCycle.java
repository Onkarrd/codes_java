package linkedlist;
//https://leetcode.com/problems/linked-list-cycle/?envType=problem-list-v2&envId=hash-table

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Definition for singly-linked list.
 */
class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    ListNode hare = head;
    ListNode tortoise = head;
    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;
      if (tortoise == hare) {
        return true;
      }
      head = head.next;
    }
    return false;
  }

  public static void main(String[] args) {
    ListNode l3 = new ListNode(-4);
    ListNode l2 = new ListNode(0);
    ListNode l1 = new ListNode(2);
    ListNode head = new ListNode(3);
    head.next = l1;
    l1.next = l2;
    l2.next = l3;
    //l3.next = l1;
    System.out.println(new LinkedListCycle().hasCycle(head));
  }
}
