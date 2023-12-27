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
    
    
    public void node(TreeNode root,int n ,int h,ArrayList<TreeNode> pre){
        if(root == null){return;}
        if(h == n){pre.add(root);}
        node(root.left,n,h+1,pre);
        node(root.right,n,h+1,pre);
    }
    
    public void ad(ArrayList<TreeNode> pre,int val){
        for(int i = 0;i<pre.size();i++){
            if(pre.get(i).left != null){
                TreeNode temp = pre.get(i).left;
                TreeNode nw = new TreeNode(val);
                pre.get(i).left = nw;
                nw.left = temp;
                nw.right = null;
            }
            else{
                TreeNode nw = new TreeNode(val);
                pre.get(i).left = nw;
                nw.left = null;
                nw.right = null;
            }
            if(pre.get(i).right != null){
                TreeNode temp = pre.get(i).right;
                TreeNode nw = new TreeNode(val);
                pre.get(i).right = nw;
                nw.right = temp;
                nw.left = null;
            }
            else{
                TreeNode nw = new TreeNode(val);
                pre.get(i).right = nw;
                nw.right = null;
                nw.left = null;
            }
        }
    }
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        ArrayList<TreeNode> pre = new ArrayList<>();
        if(depth == 1){
            TreeNode nw = new TreeNode(val);
            nw.left = root;
            nw.right = null;return nw;
        }
        // ArrayList<TreeNode> lvl = new ArrayList<>();
        // node(root,depth,0,lvl);
        node(root,depth-2,0,pre);
        ad(pre,val);
        return root;
    }
}