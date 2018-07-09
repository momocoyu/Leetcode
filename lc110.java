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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        else{
            if(Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1)
                return (isBalanced( root.left)) && (isBalanced(root.right));
            else return false;
        }
        
    }
    
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        else return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }
    
}
