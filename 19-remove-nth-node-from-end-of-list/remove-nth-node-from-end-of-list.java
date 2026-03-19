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
    public ListNode removeNthFromEnd(ListNode head, int n) {
               if(head==null){
                return head;
               }

               if(head.next==null){
                return null;
               }
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;

        }

        int t=count-n+1;
        ListNode prev=null;
        curr=head;

        if (t == 1) {
    return head.next;
}
        while( t>1 && curr!=null){
                   prev=curr;
                   curr=curr.next;
                   t--;
        }

       

        prev.next=curr.next;
        curr.next=null;
        return head;
        
    }
}