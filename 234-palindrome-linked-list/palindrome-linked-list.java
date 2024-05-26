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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        ListNode original = head.next;

        while (original != null) {
            current.next = new ListNode(original.val);
            current = current.next;
            original = original.next;
        }
        ListNode reverselistCheck = reverseList(temp);

        while (newHead != null) {
            if (newHead.val != reverselistCheck.val) {
                return false;
            }
            reverselistCheck = reverselistCheck.next;
            newHead = newHead.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
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
        return prev;
    }
}