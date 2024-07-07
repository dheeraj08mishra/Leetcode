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
    public ListNode sortList(ListNode head) {

        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int count = 0;
        Collections.sort(al);
        while (temp != null) {
            temp.val = al.get(count++);
            temp = temp.next;
        }
        return head;
    }
}