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
    ArrayList<Integer> al = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inorder(root);

        boolean sorted = true;
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) >= al.get(i + 1)) {
                sorted = false;
                break;
            }
        }
        return sorted;

    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}