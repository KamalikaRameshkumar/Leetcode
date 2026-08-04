// Last updated: 8/4/2026, 9:39:26 AM
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
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27    public TreeNode sortedListToBST(ListNode head) {
28        if (head == null) {
29            return null;
30        }
31        ListNode slow = head;
32        ListNode fast = head;
33        ListNode prev = null;
34        while (fast != null && fast.next != null) {
35            prev = slow;
36            slow = slow.next;
37            fast = fast.next.next;
38        }
39        if (prev != null) {
40            prev.next = null;
41        }
42        TreeNode root = new TreeNode(slow.val);
43        if (slow != head) {
44            root.left = sortedListToBST(head);
45        }
46        root.right = sortedListToBST(slow.next);
47        return root;
48    }
49}