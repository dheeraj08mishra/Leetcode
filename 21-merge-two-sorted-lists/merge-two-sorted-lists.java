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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = null;
        ListNode head = null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val > list2.val) {
            temp = list2;
            head = list2;
            list2 = list2.next;
        } else {
            temp = list1;
            head = list1;
            list1 = list1.next;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        while (list1 != null) {
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;

        }
        while (list2 != null) {
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;

        }
        return head;
    }
}