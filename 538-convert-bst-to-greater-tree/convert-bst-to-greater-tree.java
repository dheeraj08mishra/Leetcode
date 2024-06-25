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
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        rev(root);
        return root;
    }

    public void rev(TreeNode root) {
        if (root == null)
            return;
        rev(root.right);
        sum += root.val;
        root.val = sum;
        rev(root.left);
    }
}