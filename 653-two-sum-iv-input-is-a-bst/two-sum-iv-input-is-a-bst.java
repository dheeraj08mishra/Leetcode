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

    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        HashSet<Integer>hs = new HashSet<>();
        for(int i =0;i<al.size();i++){
            if(hs.contains(k-al.get(i))){
                return true;
            }
            hs.add(al.get(i));
        }
        return false;
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}