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
    public void reorderList(ListNode head) {
       ListNode temp = head;
        ListNode start = temp;
        ListNode fast = temp;
        while (fast != null && fast.next != null) {
            start = start.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = start.next;
        start.next = null;
        ListNode previous = null;
        ListNode current = secondHalf;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        // previous will contains the second half reverse
        ListNode firstList = head;
        ListNode secondList = previous;
        while (firstList!=null && secondList!=null){
            ListNode firstNode = firstList.next;
            ListNode secondNode = secondList.next;
            firstList.next = secondList;
            secondList.next = firstNode;
            firstList = firstNode;
            secondList = secondNode;
        }
    }
}