// Last updated: 7/22/2026, 3:19:33 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if (head == null || left == right) {
14            return head;
15        }
16
17        ListNode dummy = new ListNode(0);
18        dummy.next = head;
19
20        ListNode prev = dummy;
21        for (int i = 1; i < left; i++) {
22            prev = prev.next;
23        }
24
25        ListNode curr = prev.next;
26        for (int i = 0; i < right - left; i++) {
27            ListNode temp = curr.next;
28            curr.next = temp.next;
29            temp.next = prev.next;
30            prev.next = temp;
31        }
32
33        return dummy.next;
34    }
35}