// Last updated: 1/21/2026, 8:54:26 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        if(head == null) {
15            return false;
16        }
17        ListNode temp = head;
18        while(temp != null && temp.next != null) {
19            head = head.next;
20            temp = temp.next.next;
21            if(head== temp) {
22                return true;
23            }
24        }
25        return false;
26    }
27}