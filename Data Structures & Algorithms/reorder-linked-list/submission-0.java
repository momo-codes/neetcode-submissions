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
    public void reorderList(ListNode head) {
        int index  = 0;
        Map<Integer,ListNode> map =  new HashMap<>();
        ListNode start = head;
        while(start!=null){
            map.put(index,start);
            start = start.next;
            index++;
        }

        int n = index;
        int cr = n-1;
        ListNode temp = head;
        while(temp.next!=null){
            ListNode front = temp.next;
            if(map.get(cr)==temp){
                temp.next = null;
                return;
            }
            if(front == map.get(cr)){front.next=null;
            return;}
            temp.next = map.get(cr);
            map.get(cr).next = front;
            temp = front;
            cr--;
        }
        temp.next = null;
        return ;
    }
}
