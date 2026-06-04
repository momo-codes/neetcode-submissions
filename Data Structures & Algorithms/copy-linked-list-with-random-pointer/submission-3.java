/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node temp = head;
        while(temp!=null){
            Node clone = new Node(temp.val);
            Node front = temp.next;
            temp.next = clone;
            clone.next = front;
            temp=front;
        }

        //pointing randoms
        temp=head;
        Node res = temp.next;
        while(temp!=null){
            if(temp.random == null){
                res.random=null;
            }
            else{
                res.random = temp.random.next;
            }
            temp = temp.next.next;
            if(temp==null){
                break;
            }
            res = res.next.next;
        }
        Node dummy = new Node(-1);
        temp=head;
        res = dummy;
        Node prev = null;
        while(temp!=null){
            res.next = temp.next;
            res = res.next;
            prev = temp;
            temp = temp.next.next;
            prev.next = temp;
        }

        return dummy.next;

    }
}
