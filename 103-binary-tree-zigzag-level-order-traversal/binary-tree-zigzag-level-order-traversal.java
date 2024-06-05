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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return resultFirst;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0; // for reverse and straight
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> current = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < size; i++) {
                TreeNode peak = q.remove();
                if (level % 2 == 0) {
                    current.add(peak.val);
                } else if (level % 2 != 0) {
                    st.add(peak.val);
                    if (i == size - 1) {
                        while (!st.isEmpty()) {
                            current.add(st.pop());
                        }
                    }
                }
                if (peak.left != null) {
                    q.add(peak.left);
                }
                if (peak.right != null) {
                    q.add(peak.right);
                }
            }
            resultFirst.add(current);
            level++;
        }
        return resultFirst;
    }
}