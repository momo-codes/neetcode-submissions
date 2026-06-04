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
        Node temp = head;
        Node prev =null;
        int count=0;
        Node newHead=null;
        Map<Node,Integer>map1 = new HashMap<>();
        Node start1 = head;
        int index1=0;
        while(start1!=null){
            map1.put(start1,index1);
            start1 = start1.next;
            index1++;
        } 
        while(temp!=null){
            Node n = new Node(temp.val);
            if(count!=0){
            prev.next = n;
            }
            if(count==0){
                newHead = n;
            }
            prev = n; 
            count++;
            temp = temp.next;
        }

        Map<Integer,Node> map2 = new HashMap<>();
        Node start2 = newHead;
        int index2 =0;
        while(start2!=null){
            map2.put(index2,start2);
            start2 = start2.next;
            index2++;
        }


        Node temp1 = head ;
        Node temp2 = newHead;
        while(temp1!=null){
            if(temp1.random==null){
                temp2.random = null;
                temp1 = temp1.next;
                temp2 = temp2.next;
                continue;
            }
            temp2.random = map2.get(map1.get(temp1.random));
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return newHead;
    }
}
