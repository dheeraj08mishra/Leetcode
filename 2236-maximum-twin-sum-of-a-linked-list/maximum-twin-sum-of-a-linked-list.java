/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null){
            al.add(temp.val);
            temp = temp.next;
        }
        int first=0, second = al.size()-1;
        int max = Integer.MIN_VALUE;
        
        while (first<second){
            int currentsum = al.get(first)+al.get(second);
          max = Math.max(max,currentsum);
          first++;
          second--;
        }
        return max;
    }
}