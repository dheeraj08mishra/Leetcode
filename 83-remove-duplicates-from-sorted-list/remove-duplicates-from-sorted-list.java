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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int countIndex = 1;
        while (temp.next != null) {
            if (!hm.containsKey(temp.next.val)) {
                hm.put(temp.next.val, countIndex++);
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
                hm.put(temp.val, countIndex++);
            }
            
        }
        return dummy.next;
    }
}