// Last updated: 7/17/2026, 3:00:38 PM
import java.util.*;

class Solution {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<>();

        return build(1, n);
    }

    private List<TreeNode> build(int start, int end) {

        List<TreeNode> list = new ArrayList<>();

        // Empty tree
        if (start > end) {
            list.add(null);
            return list;
        }

        // Try every value as root
        for (int i = start; i <= end; i++) {

            List<TreeNode> leftTrees = build(start, i - 1);
            List<TreeNode> rightTrees = build(i + 1, end);

            // Combine every left with every right
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {

                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;

                    list.add(root);
                }
            }
        }

        return list;
    }
}