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
    List<List<Integer>> resultFirst = new ArrayList<>();
    List<List<Integer>> finalresultFirst = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return resultFirst;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode peak = q.remove();
                current.add(peak.val);
                if (peak.left != null) {
                    q.add(peak.left);
                }
                if (peak.right != null) {
                    q.add(peak.right);
                }

            }
            resultFirst.add(current);
        }
        for (int i = resultFirst.size() - 1; i >= 0; i--) {
            finalresultFirst.add(resultFirst.get(i));
        }
        return finalresultFirst;
    }
}