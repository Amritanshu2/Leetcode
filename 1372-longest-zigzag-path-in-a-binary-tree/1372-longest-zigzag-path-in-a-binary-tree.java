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
    
    int max = 0;
    
    public int longestZigZag(TreeNode root) {
        check(root,0,' ');
        return max;
    }
    
    public void check(TreeNode root , int count, char dir){
        
        if(root == null){return;}
        max = Math.max(max,count);
        if(dir == 'L'){
            check(root.left,1,'L');
            check(root.right,count+1,'R');
            return;
        }
        if(dir == 'R'){
            check(root.left,count+1,'L');
            check(root.right,1,'R');
            return;
        }
        
        check(root.left,1,'L');
        check(root.right,1,'R');
    }
}