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
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
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
