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
 import java.util.Stack;
class Solution {
    public ListNode reverseList(ListNode head) {
             Stack <Integer> st = new Stack<>();
             ListNode temp = head;
             while(temp!=null){
                st.push(temp.val);
                temp=temp.next;
             }
              ListNode k= head;
              while(k!=null){
                k.val= st.pop();
                   k=k.next;
              }
              return head;
    }
}