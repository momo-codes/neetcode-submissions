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

        int left = 0;
        int right = index-1;
        while(left<right){
            map.get(left).next = map.get(right);
            left++;
            if(left==right) break;
            map.get(right).next = map.get(left);
            right--;
        }
        map.get(left).next = null;
    }
}
