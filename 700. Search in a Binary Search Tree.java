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
    public TreeNode searchBST(TreeNode root, int val) {
        return preorder(root, val);
    }
    
    public TreeNode preorder(TreeNode root, int val) {
        if(root == null || root.val == val) {
            return root;
        }
        if(root.val > val) {
            return preorder(root.left, val);
        }
        if(root.val < val) {
            return preorder(root.right, val);
        }
        return null;
    }
}