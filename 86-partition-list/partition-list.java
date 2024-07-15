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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        ListNode temp = head;
        ListNode first = new ListNode(0);
        ListNode first_clone = first;
        ListNode second = new ListNode(0);
        ListNode second_clone = second;
        while (temp != null) {
            ListNode current = new ListNode(temp.val);
            if (temp.val < x) {
                first_clone.next = current;
                first_clone = first_clone.next;
            } else {
                second_clone.next = current;
                second_clone = second_clone.next;
            }
            temp = temp.next;
        }
        first_clone.next = second.next;
        return first.next;
    }
}