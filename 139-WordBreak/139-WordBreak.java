// Last updated: 8/11/2026, 9:34:30 AM
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
12    public void reorderList(ListNode head) {
13
14        if (head == null || head.next == null) {
15            return;
16        }
17        ListNode slow = head;
18        ListNode fast = head;
19
20        while (fast != null && fast.next != null) {
21            slow = slow.next;
22            fast = fast.next.next;
23        }
24        ListNode prev = null;
25        ListNode curr = slow;
26
27        while (curr != null) {
28            ListNode next = curr.next;
29            curr.next = prev;
30            prev = curr;
31            curr = next;
32        }
33        ListNode first = head;
34        ListNode second = prev;
35        while (second.next != null) {
36            ListNode temp1 = first.next;
37            ListNode temp2 = second.next;
38
39            first.next = second;
40            second.next = temp1;
41
42            first = temp1;
43            second = temp2;
44        }
45    }
46}