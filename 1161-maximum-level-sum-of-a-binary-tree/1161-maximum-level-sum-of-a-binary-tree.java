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
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    public void he(TreeNode root, int l){
        if(root == null){return ;}
        if(hm.containsKey(l)){
            hm.put(l,hm.get(l)+root.val);
        }
        else{
            hm.put(l,root.val);
        }
        he(root.left,l+1);
        he(root.right,l+1);
        
    }
    
    public int maxLevelSum(TreeNode root) {
        he(root,1);
        int i = -(int)1e8;int j = -1;
        for (Integer key : hm.keySet()) {
            if(hm.get(key)>i){j = key;i = hm.get(key);}
        }
        return j;
    }
}