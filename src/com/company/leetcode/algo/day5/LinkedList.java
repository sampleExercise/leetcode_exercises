package com.company.leetcode.algo.day5;

public class LinkedList {
    public ListNode head; // head of linked list

    LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return (head ==null);
    }
    /* Function to print middle of linked list */
    void printMiddle() {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The middle element is [" +
                slow_ptr.val + "] \n");

    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* This function prints contents of linked list
    starting from the given node */
    public void printList() {
        ListNode tnode = head;
        while (tnode != null) {
            System.out.print(tnode.val + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }
}
