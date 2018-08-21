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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return (sum(root1).equals(sum(root2)));
    }
    
    public String sum(TreeNode root){
        if(root == null) return "0";
        else if(root.left==null && root.right==null) return (root.val+"0");
        else if(root.left==null) return sum(root.right);
        else if(root.right==null) return sum(root.left);
        else{
            return sum(root.left)+sum(root.right);
        }
    }
}