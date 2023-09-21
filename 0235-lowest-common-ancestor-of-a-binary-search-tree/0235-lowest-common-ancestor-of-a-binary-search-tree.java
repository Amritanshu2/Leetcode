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
    
    public ArrayList<TreeNode> tr(TreeNode root,TreeNode m){
        if(root == null){
            return new ArrayList<>();
        }
        if(root.val == m.val){
            ArrayList<TreeNode> as = new ArrayList<>();
            as.add(root);
            return as;
        }
        ArrayList<TreeNode> la = tr(root.left,m);
        if(la.size()>0){la.add(root);return la;}
        
        ArrayList<TreeNode> ra = tr(root.right,m);
        if(ra.size()>0){ra.add(root);}
        return ra;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> al = tr(root,p);
        ArrayList<TreeNode> la = tr(root,q);
        for(int i = 0;i<al.size();i++){
            for(int j = 0;j<la.size();j++){
                if(al.get(i).val == la.get(j).val){return al.get(i);}
            }
        }
        return root;
    }
}