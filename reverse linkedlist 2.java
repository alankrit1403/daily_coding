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
    ListNode reverse(ListNode head) {
        ListNode prev=null,curr=head,next ;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head =prev ;
        return head ;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
    
    ListNode pre = null;
    ListNode current = head;

   for(int i=0;i<left-1;i++) {
       pre=current;
       current=current.next;
   }
   ListNode start = current ;
   for(int i=left;i<right;i++) {
       current = current.next ;

   }
   ListNode res = current.next;
   current.next = null;
   
   ListNode new_head = reverse(start) ;

   if(pre!=null) {
       pre.next = new_head ;
   }
   current = new_head ;
   while(current.next !=null) {
       current = current.next;
   }
   current.next = res;
   if(left==1) return new_head ;
   else return head ;
}
}