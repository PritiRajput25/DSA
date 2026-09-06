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
     ListNode swap(ListNode head){
         if(head==null || head.next==null) return head;
         ListNode first=head;
         ListNode second=head.next;
         ListNode newNode =swap(second.next);
        first.next=newNode;
        second.next=first;         
return second;
        
     }
    public ListNode swapPairs(ListNode head) {
    // int i=0;
    // ListNode curr=head;
    // ListNode prev=null;
    // while(curr!=null){
    //     prev=curr;
    //     curr=curr.next;
    //     if(i%2==0){
    //         prev.next=curr.next.next;
    //         curr.next=prev;
    //     }
    // }
return swap(head);
    }
}