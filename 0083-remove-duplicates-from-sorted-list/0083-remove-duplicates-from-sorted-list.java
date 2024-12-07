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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
          return null;
        else if(head.next==null)
          return head;
        else 
        {
             ListNode newList;
            ListNode temp=head;
             while (temp.next!=null) {
            if(temp.val==temp.next.val)
            {   
                newList=temp.next;
                temp.next=newList.next;
                newList=null;
               }
            else 
            {  
                temp=temp.next;

            }
           
        }
           
        }
        return head;
    }
    
}