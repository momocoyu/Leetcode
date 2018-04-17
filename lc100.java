//Given two binary trees, write a function to check if they are the same or not.

//Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q==null) return true;
        else if(p==null)  return false;
        else if(q==null)  return false;
  
        if(p.val==q.val){
            if (p.left!=null &&q.left!=null) {
                if(isSameTree(p.left, q.left)==false) return false;
            }
            else if(p.left==null&&q.left!=null) return false;
            else if(q.left==null&&p.left!=null) return false;
            
            if(p.right!=null && q.right!=null) {
                if(isSameTree(p.right, q.right)==false) return false;
            }
            else if(p.right==null&&q.right!=null) return false;
            else if(q.right==null&&p.right!=null) return false;
            
            if(p.right==null && q.right==null && p.left==null &q.left==null){
                return true;           //val相等并且是leaf return true
            }
        }
        else return false;
        return true;
    }
}
