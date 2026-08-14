// Last updated: 8/14/2026, 3:14:27 PM
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
12    public ListNode insertionSortList(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        ListNode current = head;
15        while (current != null) {
16            ListNode next = current.next;
17            ListNode prev = dummy;
18
19            while (prev.next != null && prev.next.val < current.val) {
20                prev = prev.next;
21            }
22            current.next = prev.next;
23            prev.next = current;
24            current = next;
25        }
26        return dummy.next;
27    }
28}