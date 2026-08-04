// Last updated: 8/4/2026, 9:46:28 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void flatten(TreeNode root) {
18        if (root == null) {
19            return;
20        }
21        flatten(root.left);
22        flatten(root.right);
23        TreeNode rightSubtree = root.right;
24        root.right = root.left;
25        root.left = null;
26        TreeNode current = root;
27        while (current.right != null) {
28            current = current.right;
29        }
30        current.right = rightSubtree;
31    }
32}