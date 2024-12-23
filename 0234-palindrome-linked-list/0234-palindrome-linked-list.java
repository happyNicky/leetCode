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
    public boolean isPalindrome(ListNode head) {
         
          ArrayList<Integer> temp1= new ArrayList<>();
            ListNode temp=head;
            while(temp!=null)
             {  temp1.add(temp.val);
                temp=temp.next;
             }
            
         while(head!=null)
         { 
             if(head.val!=temp1.getLast())
                 return false;
               temp1.removeLast();
               head=head.next;
         }
        return true;
           
    }
}