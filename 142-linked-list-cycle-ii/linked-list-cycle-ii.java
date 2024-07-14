/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode current = head;
                while (current != slow) {
                    slow = slow.next;
                     current = current.next;
                }
                return slow;
            }

        }
        return null;
    }
}