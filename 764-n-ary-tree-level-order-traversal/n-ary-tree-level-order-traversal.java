/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> current = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                 Node first = q.remove();
                current.add(first.val);
                if (first.children != null) {
                    q.addAll(first.children);
                }
            }
            result.add(current);
        }
        return result;
    }
}