package util;

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
        ListNode node = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(1);

        node.next = second;
        node.next.next = third;
        node.next.next.next = fourth;
        node.next.next.next.next = fifth;
        return node;
    }
}
