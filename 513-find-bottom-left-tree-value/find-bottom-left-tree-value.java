/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return -1;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = -1;
        while (!q.isEmpty()) {
            int size = q.size();
            ans = q.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (current.left != null)
                    q.add(current.left);
                if (current.right != null)
                    q.add(current.right);
            }

        }
        return ans;
    }
}