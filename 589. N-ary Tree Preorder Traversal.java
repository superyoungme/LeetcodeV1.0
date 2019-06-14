/*
 * recursive & iterative
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> result = new ArrayList<Integer>();
    
    public List<Integer> preorder(Node root) {
        //recursivePreorder(root);
        iterativePreorder(root);
        return result;
    }
    
    public void iterativePreorder(Node root) {
        if(root == null) {
            return ;
        }
        Stack<Node> resStack = new Stack<Node>();
        resStack.push(root);
        while(resStack.isEmpty() == false) {
            Node nodeNow = resStack.pop();
            result.add(nodeNow.val);
            if(nodeNow.children != null && nodeNow.children.size() > 0) {
                for(int i=nodeNow.children.size() - 1;i>=0;i--) {
                    Node childNode = nodeNow.children.get(i);
                    resStack.push(childNode);
                }
            }
        }
    }
    
    public void recursivePreorder(Node root) {
        if(root == null) {
            return ;
        }
        result.add(root.val);
        for(Node childNode: root.children) {
            recursivePreorder(childNode);
        }
    }
}