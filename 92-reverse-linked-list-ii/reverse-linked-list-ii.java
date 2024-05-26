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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode first = null;
        ListNode from = null;
        ListNode to = null;
        ListNode last = null;
        int count = 0;
        while (current != null) {
            count++;
            if (count < left) {
                first = current;
            }
            if (count == left) {
                from = current;
            }
            if (count == right) {
                to = current;
                last = to.next;
                break;
            }
            current = current.next;

        }
        to.next = null;
        reverseList(from);
        if (first != null) {
            first.next = to;
        } else {
            head = to;
        }
        from.next = last;
        return head;
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