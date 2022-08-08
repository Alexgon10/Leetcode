package ru.alex.leetcode.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    ListNode first;
    ListNode cur;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        return compareNode(list1, list2);

    }

    public ListNode compareNode(ListNode c1, ListNode c2) {

        if (c1.val <= c2.val) {
            return s(c1, c2);
        } else return s(c2, c1);
    }

    public ListNode s(ListNode c1, ListNode c2) {
        if (cur != null) {
            cur.next = c1;
            cur = cur.next;
        } else {
            first = c1;
            cur = first;
        }

        if (c1.next != null) {
            c1 = c1.next;
            return compareNode(c1, c2);
        } else {
            cur.next = c2;
            return first;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
