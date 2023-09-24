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
    int a = 0;
    
    public void tree(TreeNode root,int x, int y ,int m ){
        if(root== null){return ;}
        if(root.val == x){a = m;return ;}
        if(root.left!= null && root.right!= null &&((root.right).val == x && (root.left).val ==y || (root.right).val == y && (root.left).val ==x)){a = -999;return ;}
        tree(root.left,x,y,m+1);
        tree(root.right,x,y,m+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int rew = 0;
        tree(root,x,y,0);
        if(a<0){return false;}
        rew = a;
        a = 0;
        tree(root,y,x,0);
        if(a== rew){return true;}
        return false;
        
    }
}