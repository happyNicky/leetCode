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
    public ListNode reverseList(ListNode head) {
         ListNode current=head;
        ListNode prev=null;
        ListNode nextNode=null;
        while(current!=null)
        {   nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
            
        }
        return prev;
    }
}