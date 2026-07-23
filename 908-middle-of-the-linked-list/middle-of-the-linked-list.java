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
    public ListNode middleNode(ListNode head) {

     int count = 0;
     ListNode temp = head;
     while(temp!=null){
        count++;
        temp=temp.next;
     }

     int mid = (count/2)+1;
    ListNode k =head;
     while(k!=null){
        mid= mid-1;
        if(mid==0)
            break;
            
       k=k.next;
     }
     
     
        return k;
    }
}