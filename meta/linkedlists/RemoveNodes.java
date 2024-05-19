package meta.linkedlists;

import meta.linkedlists.util.ListNode;

/**
 * 2487. Remove Nodes From Linked List
 *
 * You are given the head of a linked list.
 *
 * Remove every node which has a node with a greater value anywhere to the right side of it.
 *
 * Return the head of the modified linked list.
 */

public class RemoveNodes {
    public static void main(String[] args) {

        RemoveNodes rn = new RemoveNodes();
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        new ListNode().display(head);
        ListNode newHead = rn.removeNodes(head);
        new ListNode().display(newHead);


        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(1);
        head1.next.next.next.next = new ListNode(1);

        new ListNode().display(head1);
        ListNode newHead1 = rn.removeNodes(head1);
        new ListNode().display(newHead1);

    }

    public ListNode removeNodes(ListNode head){
        if(head ==null) return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }
}
