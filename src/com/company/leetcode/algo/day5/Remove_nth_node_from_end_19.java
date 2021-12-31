package com.company.leetcode.algo.day5;

public class Remove_nth_node_from_end_19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null){
            length ++;
            first = first.next;
        }
        length-= n;
        first = dummy;
        while (length > 0){
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        for (int i = 5; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }

        ListNode removed = removeNthFromEnd(llist.head, 2);
        int length = 5;
        while(length > 1){
            llist.printList();
            length--;
        }
    }
}
