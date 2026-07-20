// Last updated: 7/20/2026, 7:11:04 AM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode prevGroup = dummy;
16
17        while (true) {
18            ListNode kth = prevGroup;
19            for (int i = 0; i < k && kth != null; i++) {
20                kth = kth.next;
21            }
22
23            if (kth == null) {
24                break;
25            }
26
27            ListNode groupNext = kth.next;
28            ListNode prev = groupNext;
29            ListNode curr = prevGroup.next;
30
31            while (curr != groupNext) {
32                ListNode temp = curr.next;
33                curr.next = prev;
34                prev = curr;
35                curr = temp;
36            }
37
38            ListNode temp = prevGroup.next;
39            prevGroup.next = kth;
40            prevGroup = temp;
41        }
42
43        return dummy.next;
44    }
45}