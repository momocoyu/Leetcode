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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if((root.val >= p.val && root.val <= q.val)||(root.val <= p.val && root.val >= q.val)){
            return root;
        }
        else if(root.val>p.val&&root.val>q.val){
            root = root.left;
            root = lowestCommonAncestor(root, p, q);
        }
        else if(root.val<p.val&&root.val<q.val){
            root = root.right;
            root = lowestCommonAncestor(root, p, q);
        }
        return root;
    }
}