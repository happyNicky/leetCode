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
        
       if(head==null)
           return null;
           while(head!=null&&head.val==val )
            head=head.next;
            if(head==null)
            return null;
        ListNode temp=head;
        ListNode prev=head;
        
         while(temp!=null)
         {  if(temp.val==val)
            {  prev.next=temp.next;
                temp=null;
                temp=prev.next;
            }
            else 
            {   prev=temp;
                temp=temp.next;
            }
         }
        
       return head;
    }
}