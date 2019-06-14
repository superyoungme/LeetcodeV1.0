/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {    
    public boolean isUnivalTree(TreeNode root) {
        int rootVal = root.val;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(stack.isEmpty() == false) {
            TreeNode node = stack.pop();
            if(node.val != rootVal) {
                return false;
            }
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return true;
    }
    
}