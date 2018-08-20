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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return root;
        if(root.val<L){
            root = root.right;
            return trimBST(root,L,R);
        }
        else if(root.val>R){
            root = root.left;
            return trimBST(root,L,R);
        }
        else{
            if(root.left!=null){
                root.left = trimBST(root.left,L,R);
            }
            if(root.right!=null){
                root.right = trimBST(root.right,L,R);
            }
        }
        return root;
    }
}