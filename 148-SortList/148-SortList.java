// Last updated: 10/6/2026, 9:45:00 AM
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
12    public ListNode sortList(ListNode head) {
13
14        // Empty list or single node
15        if (head == null || head.next == null) {
16            return head;
17        }
18
19        // Find middle using slow and fast pointers
20        ListNode slow = head;
21        ListNode fast = head.next;
22
23        while (fast != null && fast.next != null) {
24            slow = slow.next;
25            fast = fast.next.next;
26        }
27
28        // Split the list into two halves
29        ListNode second = slow.next;
30        slow.next = null;
31
32        // Sort both halves
33        ListNode left = sortList(head);
34        ListNode right = sortList(second);
35
36        // Merge sorted halves
37        return merge(left, right);
38    }
39
40    private ListNode merge(ListNode l1, ListNode l2) {
41
42        ListNode dummy = new ListNode(0);
43        ListNode current = dummy;
44
45        while (l1 != null && l2 != null) {
46
47            if (l1.val <= l2.val) {
48                current.next = l1;
49                l1 = l1.next;
50            } else {
51                current.next = l2;
52                l2 = l2.next;
53            }
54
55            current = current.next;
56        }
57
58        // Attach remaining nodes
59        if (l1 != null) {
60            current.next = l1;
61        } else {
62            current.next = l2;
63        }
64
65        return dummy.next;
66    }
67}