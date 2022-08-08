package ru.alex.leetcode.easy;

import java.util.HashSet;
import java.util.Set;


/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * */

public class IntersectionOfTwoLinkedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        Set<ListNode> set = new HashSet<>();
        ListNode result =null;
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            while(headA!=null || headB!=null){
                check(headA);
                check(headB);
                if (result!=null) return result;
                headA = headA==null ? null : headA.next;
                headB = headB==null ? null : headB.next;
            }
            return null;
        }

        public void check(ListNode node){

            if(set.contains(node)){
                result = node;
            }
            if(node!=null){
                set.add(node);
            }

        }
    }
}
