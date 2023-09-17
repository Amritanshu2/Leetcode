/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public TreeNode tree(int[] nums, int i ,int j ) {
        if(i>j)return null;
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tree(nums,i ,mid-1);
        root.right = tree(nums,mid+1,j);
        return root;
        
    }
    
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums,0,nums.length-1);
    }
}