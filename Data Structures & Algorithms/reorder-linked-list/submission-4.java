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

 // optimal O(1) sc and O(N) tc

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
    public void reorderList(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        slow.next = null;
        ListNode temp1 = head;
        ListNode temp2 = newHead;
        ListNode front1 ;
        ListNode front2 ;

        while(temp2!=null){
            front1 = temp1.next;
            front2=temp2.next;
            temp1.next = temp2;
            temp2.next = front1;
            temp1 = front1;
            temp2 = front2;
        }
    }
}
