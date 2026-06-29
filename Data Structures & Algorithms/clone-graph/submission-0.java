/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public void dfs(Node node,Map<Node,Node> map){
        Node clone = new Node(node.val);
        map.put(node,clone);
        for(int i=0;i<node.neighbors.size();i++){
            Node n = node.neighbors.get(i);
           if(map.containsKey(n)){
                clone.neighbors.add(map.get(n));
           }
           else{
            dfs(n,map);
            clone.neighbors.add(map.get(n));
           }
        }
    }
    public Node cloneGraph(Node node) {
        //dfs

        if(node == null){
            return node;
        }
        if(node.neighbors.size()==0){
            return new Node(node.val);
        }
        Map<Node,Node> map = new HashMap<>();

        dfs(node,map);

        return map.get(node);
    }
}