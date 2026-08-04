// Last updated: 8/4/2026, 9:34:23 AM
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
17    int postIndex;
18    Map<Integer, Integer> map = new HashMap<>();
19    public TreeNode buildTree(int[] inorder, int[] postorder) {
20        postIndex = postorder.length - 1;
21        for (int i = 0; i < inorder.length; i++) {
22            map.put(inorder[i], i);
23        }
24        return build(inorder, postorder, 0, inorder.length - 1);
25    }
26    private TreeNode build(int[] inorder, int[] postorder,
27                           int left, int right) {
28
29        if (left > right) {
30            return null;
31        }
32        int rootValue = postorder[postIndex--];
33        TreeNode root = new TreeNode(rootValue);
34        int rootIndex = map.get(rootValue);
35        root.right = build(inorder, postorder,rootIndex + 1, right);
36        root.left = build(inorder, postorder,left, rootIndex - 1);
37
38        return root;
39    }
40}