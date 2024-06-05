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
    List<Integer> al = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversalTree(root);
        return al;
    }

    public void inorderTraversalTree(TreeNode root) {
        // if (root == null)
        // return;
        // inorderTraversalTree(root.left);
        // al.add(root.val);
        // inorderTraversalTree(root.right);

        // iterative approach
        TreeNode curr = root;
        while (st.size() > 0 || curr != null) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.peek();
            st.pop();
            al.add(curr.val);
            curr = curr.right;
        }
    }
}