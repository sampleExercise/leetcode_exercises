package com.company.leetcode.algo.day5;

public class Middle_of_the_linked_list_876 {
    public static ListNode middleNode(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int t = 0;
        while (head != null) {
            arr[t++] = head;
            head = head.next;
        }
        return arr[t / 2];
    }


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i = 5; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
        ListNode middlenode = middleNode(llist.head);
        System.out.println("middle node: "+ middlenode.val);
    }
}
