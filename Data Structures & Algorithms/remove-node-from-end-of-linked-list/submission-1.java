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

    public ListNode reverse(ListNode head){
     ListNode prev = null;
     ListNode curr = head;
     while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev=curr;
        curr=next;
     }
     return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode newHead = reverse(head);
            ListNode temp = newHead;
            n--;  //
            ListNode prev = null; //
            while(n>0){
                prev = temp; // prev-2
                temp = temp.next;  // temp-1  // n-0
                n--;
            }
            ListNode front = temp.next;//front- 1
            // prev-2
            if(prev==null){
                return reverse(front);
            }
            prev.next = front;
            temp.next=null;
            return reverse(newHead);

    }
}
