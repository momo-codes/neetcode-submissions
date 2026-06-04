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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1  =l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        int carry=0;
        int t1;
        int t2;
        while((temp1!=null || temp2!=null) || carry!=0){
            if(temp1==null){
                 t1 =0;
            }
            else{
                 t1 = temp1.val;
                temp1 = temp1.next;
            }
            if(temp2==null){
                 t2 =0;
            }
            else{
                 t2 = temp2.val;
                temp2 = temp2.next;
            }
            int sum = t1+t2+carry;
            carry = sum/10;
            ListNode n = new ListNode(sum%10);
            res.next = n;
            res =n;
        }
        return dummy.next;
    }
}
