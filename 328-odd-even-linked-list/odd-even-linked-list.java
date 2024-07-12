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
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        ListNode temp = head;
        ListNode even = new ListNode(0);
        ListNode evenTemp = even;
        ListNode odd = new ListNode(0);
        ListNode oddTemp = odd;
        int count = 1;
        while (temp != null) {
            if (count % 2 == 0) {
                ListNode currentData = new ListNode(temp.val);
                evenTemp.next = currentData;
                evenTemp = evenTemp.next;
            } else {
                ListNode currentData = new ListNode(temp.val);
                oddTemp.next = currentData;
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
            count++;
        }
        odd = odd.next;
        oddTemp = odd;
        while (odd != null) {
            if (odd.next == null) {
                odd.next = even.next;
                break;
            }
            odd = odd.next;
        }

        return oddTemp;

    }
}