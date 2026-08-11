// Last updated: 8/11/2026, 9:32:59 AM
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
16 class Solution {
17    public TreeNode buildTree(int[] preorder, int[] inorder) {
18        if (preorder.length == 0 || inorder.length == 0) {
19            return null;
20        }
21
22        TreeNode root = new TreeNode(preorder[0]);
23
24        int mid = 0;
25        while (inorder[mid] != preorder[0]) {
26            mid++;
27        }
28
29        int[] leftPreorder = new int[mid];
30        int[] rightPreorder = new int[preorder.length - mid - 1];
31
32        for (int i = 0; i < mid; i++) {
33            leftPreorder[i] = preorder[i + 1];
34        }
35
36        for (int i = 0; i < rightPreorder.length; i++) {
37            rightPreorder[i] = preorder[mid + i + 1];
38        }
39
40        int[] leftInorder = new int[mid];
41        int[] rightInorder = new int[inorder.length - mid - 1];
42
43        for (int i = 0; i < mid; i++) {
44            leftInorder[i] = inorder[i];
45        }
46
47        for (int i = 0; i < rightInorder.length; i++) {
48            rightInorder[i] = inorder[mid + i + 1];
49        }
50
51        root.left = buildTree(leftPreorder, leftInorder);
52        root.right = buildTree(rightPreorder, rightInorder);
53
54        return root;
55    }
56}
57