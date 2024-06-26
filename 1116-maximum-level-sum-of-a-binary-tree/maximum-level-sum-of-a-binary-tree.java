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
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        q.add(root);
        al.add(root.val);

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = q.remove();
                if (current.left != null) {
                    sum += current.left.val;
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                    sum += current.right.val;
                }

            }
            if (!q.isEmpty()) {
                al.add(sum);
            }

        }
        int maxIndex = 0;
        for (int i = 1; i < al.size(); i++) {
            if (al.get(maxIndex) < al.get(i)) {
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }
}