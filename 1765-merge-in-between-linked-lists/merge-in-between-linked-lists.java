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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current = list1;
        int index = 0;
        while (index < a - 1) {
            current = current.next;
            index++;

        }
        ListNode start = current;
        while (index < b + 1) {
            current = current.next;
            index++;

        }
        ListNode rear = current;
        ListNode secondListTail = list2;
        ListNode secondList = list2;
        start.next = secondList;
        while (secondListTail.next != null) {
            secondListTail = secondListTail.next;
        }
        secondListTail.next = rear;
        return list1;
    }
}