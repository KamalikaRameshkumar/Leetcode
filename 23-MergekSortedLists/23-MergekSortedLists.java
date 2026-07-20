// Last updated: 7/20/2026, 7:10:15 AM
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
11import java.util.PriorityQueue;
12
13class Solution {
14    public ListNode mergeKLists(ListNode[] lists) {
15        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
16
17        for (ListNode node : lists) {
18            if (node != null) {
19                pq.offer(node);
20            }
21        }
22
23        ListNode dummy = new ListNode(0);
24        ListNode current = dummy;
25
26        while (!pq.isEmpty()) {
27            ListNode node = pq.poll();
28            current.next = node;
29            current = current.next;
30
31            if (node.next != null) {
32                pq.offer(node.next);
33            }
34        }
35
36        return dummy.next;
37    }
38}