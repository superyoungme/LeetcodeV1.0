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
    private int sum;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        preorder(root, L, R);
        return sum;
    }
    
    public void preorder(TreeNode root, int L, int R) {
        if(root == null) {
            return ;
        }
        preorder(root.left, L, R);
        if(root.val >= L && root.val <= R) {
            sum += root.val;
        }
        preorder(root.right, L, R);
    }
}