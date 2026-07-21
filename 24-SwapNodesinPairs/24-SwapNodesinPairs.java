// Last updated: 7/21/2026, 9:51:51 AM
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
12    public ListNode swapPairs(ListNode head) {
13
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16
17        ListNode prev = dummy;
18
19        while (prev.next != null && prev.next.next != null) {
20
21            ListNode first = prev.next;
22            ListNode second = first.next;
23
24            first.next = second.next;
25            second.next = first;
26            prev.next = second;
27
28            prev = first;
29        }
30
31        return dummy.next;
32    }
33}