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
    public TreeNode sortedArrayToBST(int[] nums) {
        return getMiddle(nums,0,nums.length-1);
    }
     
    public TreeNode getMiddle(int[] nums, int low,int high){
        int mid;
        if(low>high)
            return null;
        
        mid = (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left=getMiddle(nums,low,mid-1);
        node.right =getMiddle(nums,mid+1,high);
        return node;
    }
}
