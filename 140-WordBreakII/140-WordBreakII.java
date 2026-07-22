// Last updated: 7/22/2026, 3:15:23 PM
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
13    public ListNode detectCycle(ListNode head) {
14        if (head == null || head.next == null) {
15            return null;
16        }
17
18        ListNode slow = head;
19        ListNode fast = head;
20
21        // Detect cycle
22        while (fast != null && fast.next != null) {
23            slow = slow.next;
24            fast = fast.next.next;
25
26            if (slow == fast) {
27                ListNode start = head;
28
29                while (start != slow) {
30                    start = start.next;
31                    slow = slow.next;
32                }
33
34                return start;
35            }
36        }
37
38        return null;
39    }
40}