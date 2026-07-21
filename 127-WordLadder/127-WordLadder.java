// Last updated: 7/21/2026, 10:28:53 AM
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
17
18    int maxSum = Integer.MIN_VALUE;
19
20    public int maxPathSum(TreeNode root) {
21        dfs(root);
22        return maxSum;
23    }
24
25    private int dfs(TreeNode node) {
26
27        if (node == null) {
28            return 0;
29        }
30
31        int left = Math.max(0, dfs(node.left));
32        int right = Math.max(0, dfs(node.right));
33
34        // Maximum path passing through this node
35        maxSum = Math.max(maxSum, node.val + left + right);
36
37        // Return the maximum gain to the parent
38        return node.val + Math.max(left, right);
39    }
40}