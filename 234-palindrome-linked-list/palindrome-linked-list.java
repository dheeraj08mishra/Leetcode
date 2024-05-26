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
        ListNode slow = head;
        ListNode fast = head;
        if (fast == null || fast.next == null)
            return true;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow);
        while (secondHalf != null && secondHalf.next != null) {
            if (temp.val != secondHalf.val) {
                return false;
            }
            secondHalf = secondHalf.next;
            temp = temp.next;
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