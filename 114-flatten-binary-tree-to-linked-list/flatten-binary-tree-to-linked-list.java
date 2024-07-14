/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer>al = new ArrayList<>();
    public void flatten(TreeNode root) {
        Preorder(root);
        TreeNode current = root;
        for(int i=1;i<al.size();i++){
            current.left = null;
            current.right = new TreeNode(al.get(i));
            current = current.right;
        }
        
    }
    public void Preorder(TreeNode root){
        if(root == null){
            return;
        }
        al.add(root.val);
        Preorder(root.left);
        Preorder(root.right);
    }
}