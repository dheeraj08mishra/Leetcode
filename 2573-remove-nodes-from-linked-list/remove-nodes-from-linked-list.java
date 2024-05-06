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
    public ListNode removeNodes(ListNode head) {
        /// reverse the list first for traverse
        ListNode temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        while (temp != null) {
            ListNode forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forward;
        }
        /// traverse for conditional
        head = prev;
        temp = prev.next;
        while (temp != null) {
            if (temp.val < prev.val) {
                prev.next = temp.next;
            } else {
                prev = prev.next;
            }

            temp = temp.next;
        }
        temp = head;
        ListNode previous = null;
        while (temp != null) {
            ListNode nextNode = null;
            nextNode = temp.next;
            temp.next = previous;
            previous = temp;
            temp = nextNode;
        }
        return previous;
    }
}