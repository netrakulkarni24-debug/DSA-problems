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
    public ListNode removeElements(ListNode head, int val) {
        // 1. First, advance head past any matching values at the start
        while (head != null && head.val == val) {
            head = head.next;
        }

        // 2. Now run your loop logic!
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            if (temp.val == val) {
                prev.next = temp.next; // Delete temp, don't move prev
            } else {
                prev = temp; // Only move prev when temp was NOT deleted
            }
            temp = temp.next;
        }

        return head;
    }
}