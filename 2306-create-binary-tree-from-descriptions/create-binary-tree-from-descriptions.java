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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> nodes = new HashMap<>();
        HashSet<Integer> childrentList = new HashSet<>();
        for (int[] desc : descriptions) {
            int parentData = desc[0];
            int childData = desc[1];
            boolean isLeft = desc[2] == 1;

            TreeNode parent = nodes.getOrDefault(parentData, new TreeNode(parentData));
            TreeNode child = nodes.getOrDefault(childData, new TreeNode(childData));
            if (isLeft) {
                parent.left = child;
            } else {
                parent.right = child;
            }
            nodes.put(parentData, parent);
            nodes.put(childData, child);
            childrentList.add(childData);
        }

        for (int nodeData : nodes.keySet()) {
            if (!childrentList.contains(nodeData)) {
                return nodes.get(nodeData);
            }
        }
        return null;
    }
}