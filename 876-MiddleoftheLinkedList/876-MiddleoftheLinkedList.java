// Last updated: 1/21/2026, 10:13:55 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode middleNode(ListNode head) {
13        ListNode fast = head;
14        while(fast != null && fast.next != null) {
15            head = head.next;
16            fast = fast.next.next;
17        }
18        return head;
19    }
20}