// Last updated: 8/11/2026, 9:35:53 AM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19
20        postorder(root, result);
21
22        return result;
23    }
24
25    public void postorder(TreeNode root, List<Integer> result) {
26        if (root == null) {
27            return;
28        }
29
30        postorder(root.left, result);
31        postorder(root.right, result);
32        result.add(root.val);
33    }
34}