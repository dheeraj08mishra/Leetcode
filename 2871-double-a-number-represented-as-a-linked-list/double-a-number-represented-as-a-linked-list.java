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
    public ListNode doubleIt(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        if (head == null)
            return head;
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        String currentNumber = sb.toString();
        int carry = 0;
        StringBuilder result = new StringBuilder();
        ListNode dummy = new ListNode(0);
        temp = dummy;
        for (int i = currentNumber.length() - 1; i >= 0; i--) {
            int tempData = Character.getNumericValue(currentNumber.charAt(i));
            int digit = 2 * tempData + carry;
            result.insert(0, digit % 10);
            carry = digit / 10;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        for (int i = 0; i < result.length(); i++) {
            int tempData = Character.getNumericValue(result.charAt(i));
            temp.next = new ListNode(tempData);
            temp = temp.next;
        }
        return dummy.next;
    }
}