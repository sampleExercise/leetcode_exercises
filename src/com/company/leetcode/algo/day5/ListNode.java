package com.company.leetcode.algo.day5;

/* Linked list node */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int d) {
        val = d;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}