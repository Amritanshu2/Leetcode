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
    List<TreeNode>al = new ArrayList<>();
    
    public TreeNode trav(TreeNode root,HashSet<Integer>hm,TreeNode p){
        if(root == null){return null;}
        root.left = trav(root.left,hm,root);
        root.right = trav(root.right,hm,root);
        if(hm.contains(root.val)){
            if(root.left!=null){
            al.add(root.left);}
            if(root.right!=null){al.add(root.right);}
            return null;
        }
        if(p == null){al.add(root);}
        return root;
        
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<to_delete.length;i++){
            hs.add(to_delete[i]);
        }
        trav(root,hs,null);
        
        return al ;
    }
}