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
    
    HashMap<Integer,Integer>hm = new HashMap<>();
    
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null){return null;}
        trav(root,0);
        update(root,root.val,0);
        return root;
    }
    
    public void trav(TreeNode root, int lvl){
        if(root == null)return;
        hm.put(lvl,hm.getOrDefault(lvl,0)+root.val);
        trav(root.left,lvl+1);
        trav(root.right,lvl+1);
    }
    
    public void update(TreeNode root, int sum, int lvl){
        if(root == null)return;
        
        root.val = hm.get(lvl)-sum;
        sum = 0;
        if(root.left != null){sum += (root.left).val;}
        if(root.right != null){sum += (root.right).val;}
        
        update(root.left,sum,lvl+1);
        update(root.right,sum,lvl+1);
    }
}