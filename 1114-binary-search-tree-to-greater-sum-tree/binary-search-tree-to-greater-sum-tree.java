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

    public TreeNode bstToGst(TreeNode root) {
        reverse_inorder(root);
        return root;
    }

    public void reverse_inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        reverse_inorder(root.right);
        sum += root.val;
        root.val = sum;
        reverse_inorder(root.left);
    }

}