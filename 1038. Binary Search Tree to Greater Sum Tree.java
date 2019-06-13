/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
 * TODO ∑«µ›πÈ µœ÷
 */
class Solution {
    private int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        inorder(root);
        return root;
    }
    
    public void inorder(TreeNode root) {
        if(root == null) {
            return ;
        }
        inorder(root.right);
        sum = sum + root.val;
        root.val = sum;
        inorder(root.left);
    }
}