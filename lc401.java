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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left== null && root.right == null) return 0;
        int sum = 0 ;
        if(root.left!=null && root.left.right ==null &&root.left.left==null)
            sum =  root.left.val;
        sum+= sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        return sum;
    }
}
