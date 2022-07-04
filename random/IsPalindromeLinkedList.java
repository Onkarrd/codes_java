package random;

import code.util.ListNode;
import java.util.ArrayList;
import java.util.List;

class IsPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        boolean isPalindrome = true;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int first = 0;
        int last = list.size() - 1;
        if (first == last)
            return true;
        while (first < last) {
            if (list.get(first) != list.get(last)) {
                isPalindrome = false;
            }
            first++;
            last--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.populate();
        System.out.println(new IsPalindromeLinkedList().isPalindrome(listNode));
    }

}
