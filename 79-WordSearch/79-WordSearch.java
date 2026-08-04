// Last updated: 8/4/2026, 9:24:37 AM
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
11 class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode prev = dummy;
16        ListNode curr = head;
17        while (curr != null) {
18            if (curr.next != null && curr.val == curr.next.val) {
19                int duplicate = curr.val;
20                while (curr != null && curr.val == duplicate) {
21                    curr = curr.next;
22                }
23                prev.next = curr;
24            } else {
25                prev = curr;
26                curr = curr.next;
27            }
28        }
29        return dummy.next;
30    }
31}