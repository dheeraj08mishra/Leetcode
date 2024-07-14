/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[al.size()];
        for (int i = al.size() - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= al.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek();
            }
            st.push(al.get(i));
        }
        return ans;
    }
}