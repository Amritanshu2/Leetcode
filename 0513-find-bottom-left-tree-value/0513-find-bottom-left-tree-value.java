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
    HashMap<Integer,Integer> hm = new HashMap<>();int j = 0;
    public void node (TreeNode root,int n){
        if(root == null){return;}
        node(root.left,n+1);
        if(!hm.containsKey(n)){hm.put(n,root.val);}
        if(n>j){j = n;}
        node(root.right,n+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        int x = 0;
        node(root,x);
        return hm.get(j);
    }
}