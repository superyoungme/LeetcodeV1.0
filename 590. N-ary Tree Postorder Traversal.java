/*
 * 后序遍历=从右向左的前序遍历+reverse
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
    
    public List<Integer> postorder(Node root) {
        //recursivePostorder(root);
        iterativePostorder(root);
        return result;
    }
    
    public void iterativePostorder(Node root) {
        if(root == null) {
            return ;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(stack.isEmpty() == false){
            Node nodeNow = stack.pop();
            result.add(nodeNow.val);
            for(Node childNode: nodeNow.children) {
                stack.push(childNode);
            }
        }
        Collections.reverse(result);
    }
    
    public void recursivePostorder(Node root) {
        if(root == null) {
            return ;
        }
        for(Node childNode: root.children) {
            recursivePostorder(childNode);
        }
        result.add(root.val);
    }
}