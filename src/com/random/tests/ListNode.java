package com.random.tests;

public class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        System.out.println(listNode.swapPairs(listNode));
    }

}
