// Last updated: 8/4/2026, 9:43:55 AM
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> result = new ArrayList<>();
19        dfs(root, targetSum, new ArrayList<>(), result);
20        return result;
21    }
22    private void dfs(TreeNode root, int targetSum,List<Integer> path,List<List<Integer>> result) {
23        if (root == null) {
24            return;
25        }
26        path.add(root.val);
27        if (root.left == null && root.right == null) {
28            if (targetSum == root.val) {
29                result.add(new ArrayList<>(path));
30            }
31        } else {
32            dfs(root.left, targetSum - root.val, path, result);
33            dfs(root.right, targetSum - root.val, path, result);
34        }
35        path.remove(path.size() - 1);
36    }
37}