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
        
    int count=0;
    ListNode curr = head ;

    while(curr!=null) {
        curr=curr.next;
        count++;
    }

    if(count==1) return null ;
    if(count==n) return head.next;
    
    ListNode temp = head ;
    for(int i=1;i<count-n;i++) {
        temp = temp.next;
    }
   temp.next=temp.next.next;
    
    return head ;
    }
    
}