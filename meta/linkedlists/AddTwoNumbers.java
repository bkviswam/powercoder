package meta.linkedlists;

import meta.linkedlists.util.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode ds = new ListNode();
        ds.display(l1);
        ds.display(l2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode newHead = addTwoNumbers.addTwoNumbers(l1, l2);
        ds.display(newHead);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode head = dummyHead;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;

            head.next = new ListNode(sum % 10);
            carry = sum / 10;

            head = head.next;

            l1 = l1 != null ? l1.next : null;

            l2 = l2 != null ? l2.next : null;
        }
        if (carry > 0)
            head.next = new ListNode(carry);

        return dummyHead.next;
    }
}
