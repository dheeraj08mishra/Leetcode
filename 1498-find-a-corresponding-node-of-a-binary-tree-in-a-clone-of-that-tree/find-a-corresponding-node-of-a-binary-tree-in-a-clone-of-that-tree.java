/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null)
            return original;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(cloned);
        while (!q.isEmpty()) {
            TreeNode current = q.remove();
            if (current.val == target.val)
                return current;
            if (current.left != null)
                q.add(current.left);
            if (current.right != null)
                q.add(current.right);
        }

        return null;

    }
}