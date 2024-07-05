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
    ArrayList<Long> al = new ArrayList<>();

    public long kthLargestLevelSum(TreeNode root, int k) {
        levelOrder(root);
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < al.size(); i++) {
            pq.add(al.get(i));
        }
        
        if (k > al.size()) {
            return -1;
        }
        while (k > 1) {
            pq.poll();
            k--;
        }
        return pq.peek();
    }

    public void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                sum += current.val;
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
            al.add(sum);
        }
    }
}