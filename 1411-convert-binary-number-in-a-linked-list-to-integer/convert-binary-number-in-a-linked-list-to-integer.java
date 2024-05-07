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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        int sum = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(sb.charAt(i)) != 0) {
                sum += Math.pow(2, sb.length() - 1 - i);
            }
        }
        return sum;
    }
}