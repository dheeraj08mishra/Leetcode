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

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < al.size() - 1; i++) {
            ans = Math.min(ans, (al.get(i + 1) - al.get(i)));
        }
        return ans;
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