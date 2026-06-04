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

//using one hashmap

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node temp= head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }
        Node temp1 = head;
        while(temp1!=null){
            Node clone = map.get(temp1);
            clone.next = map.get(temp1.next);
            clone.random = map.get(temp1.random);
            temp1 = temp1.next;
        }

        return map.get(head);
    }
}
