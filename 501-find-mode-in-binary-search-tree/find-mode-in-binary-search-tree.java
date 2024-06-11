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

    public int[] findMode(TreeNode root) {
        preOrder(root);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < al.size(); i++) {
            if (!hm.containsKey(al.get(i))) {
                hm.put(al.get(i), 1);
            } else {
                hm.put(al.get(i), hm.get(al.get(i)) + 1);
            }
        }
        int max = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            if (hm.get(al.get(i)) > max) {
                max = hm.get(al.get(i));
            }
        }
        for (int i = 0; i < al.size(); i++) {
            if (hm.get(al.get(i)) == max && !ans.contains(al.get(i))) {
                ans.add(al.get(i));
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}