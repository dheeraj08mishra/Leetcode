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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        if (head == null || head.next == null)
            return head;

            ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode current = head;

        while(current!=null && current.next!=null){
            ListNode first = current;
            ListNode second = current.next;
            first.next = second.next;
            second.next = first;
            temp.next = second;
            temp = first;
            current = first.next;

        }

    return dummy.next;
}}