package hashing;

import util.ListNode;

public class IntersectionOfTwoLinkedList {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;

    while (a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
    return a;
  }

  public static void main(String[] args) {
    ListNode l1 = ListNode.populate();
    ListNode l2 = ListNode.populate();
    l1.next.next = l2.next;
    System.out.println(new IntersectionOfTwoLinkedList().getIntersectionNode(l1, l2));
  }
}
