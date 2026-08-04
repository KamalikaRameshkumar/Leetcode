// Last updated: 8/4/2026, 9:38:06 AM
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19        if (root == null) {
20            return result;
21        }
22        Queue<TreeNode> queue = new LinkedList<>();
23        queue.offer(root);
24        while (!queue.isEmpty()) {
25            int size = queue.size();
26            List<Integer> level = new ArrayList<>();
27            for (int i = 0; i < size; i++) {
28                TreeNode current = queue.poll();
29                level.add(current.val);
30                if (current.left != null) {
31                    queue.offer(current.left);
32                }
33                if (current.right != null) {
34                    queue.offer(current.right);
35                }
36            }
37            result.add(0, level);
38        }
39        return result;
40    }
41}