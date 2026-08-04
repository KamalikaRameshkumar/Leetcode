// Last updated: 8/4/2026, 9:26:46 AM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode lessDummy = new ListNode(0);
14        ListNode greaterDummy = new ListNode(0);
15        ListNode less = lessDummy;
16        ListNode greater = greaterDummy;
17        while (head != null) {
18            if (head.val < x) {
19                less.next = head;
20                less = less.next;
21            } else {
22                greater.next = head;
23                greater = greater.next;
24            }
25            head = head.next;
26        }
27        greater.next = null;
28        less.next = greaterDummy.next;
29        return lessDummy.next;
30    }
31}