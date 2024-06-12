/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "n";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode current = q.remove();
            if (current != null) {
                sb.append(current.val + " ");
                q.add(current.left);
                q.add(current.right);
            } else {
                sb.append("n ");
                continue;
            }

        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("") || data.equals("n"))
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        int i = 1;
        while (!q.isEmpty()) {
            TreeNode current = q.remove();
            if (!values[i].equals("n")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(current.left);
            }
            if (!values[i+1].equals("n")) {
                current.right = new TreeNode(Integer.parseInt(values[i+1]));
                q.add(current.right);
            }
            i=i+2;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));