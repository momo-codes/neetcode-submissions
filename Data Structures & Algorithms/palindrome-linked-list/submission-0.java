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
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int middle = (count%2==0)?count/2:count/2+1;

        Deque<Integer> st = new ArrayDeque<>();
        ListNode start = head;
        st.push(start.val);
        middle--;
        while(start.next!=null){
            if(middle>0){
                start = start.next;
                st.push(start.val);
                middle--;
            }
            else{
                if(count%2!=0){
                    st.pop();
                    count++;
                }
                start = start.next;
                if(st.pop()!=start.val){
                    return false;
                }
            }
        }
        return true;
        
    }
}