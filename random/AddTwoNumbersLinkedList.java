package random;

import util.ListNode;

public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        ListNode n13 = new ListNode(9);
        ListNode n12 = new ListNode(9, n13);
        ListNode n11 = new ListNode(9, n12);

        ListNode n23 = new ListNode(9);
        ListNode n22 = new ListNode(9, n23);
        ListNode n21 = new ListNode(9, n22);

        ListNode n1 = n11;
        ListNode n2 = n21;
        ListNode resHead = addTwoLists(n1, n2);
        System.out.println(n11.toString());
        System.out.println(n21.toString());
        System.out.println(resHead.toString());

    }

    private static ListNode addTwoLists(ListNode n1, ListNode n2) {
        ListNode res = null;
        ListNode resHead = null;
        int carry = 0;
        while (n1 != null || n2 != null || carry != 0) {
            int nodeRes = (n1 != null ? n1.val : 0) + (n2 != null ? n2.val : 0) + carry;
            if (nodeRes / 10 != 0) {
                nodeRes = nodeRes - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (res != null) {
                res.next = new ListNode(nodeRes);
                res = res.next;
            } else {
                res = new ListNode(nodeRes);
                resHead = res;
            }
            n1 = n1 != null ? n1.next : null;
            n2 = n2 != null ? n2.next : null;

        }
        return resHead;
    }
}
