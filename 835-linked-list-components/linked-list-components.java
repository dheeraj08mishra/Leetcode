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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        int count = 0;
        boolean present = false;
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hm.add(nums[i]);
        }
        while (temp != null) {
            if (hm.contains(temp.val)) {
                present = true;
            } else if (!hm.contains(temp.val) && present) {
                count++;
                present = false;
            }
            temp = temp.next;
        }
        if (present) {
            count++;
        }
        return count;
    }
}