// Last updated: 8/4/2026, 9:51:03 AM
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
17    public int sumNumbers(TreeNode root) {
18        return dfs(root, 0);
19    }
20    private int dfs(TreeNode root, int current) {
21        if (root == null) {
22            return 0;
23        }
24        current = current * 10 + root.val;
25        if (root.left == null && root.right == null) {
26            return current;
27        }
28        return dfs(root.left, current)
29             + dfs(root.right, current);
30    }
31}