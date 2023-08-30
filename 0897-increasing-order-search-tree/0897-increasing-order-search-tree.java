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
    
    public ArrayList<Integer> inc(TreeNode root,ArrayList al) {
        if(root == null){return al;}
        al.add(root.val);
        inc(root.left,al);
        inc(root.right,al);
        return al;
    }
    
    public TreeNode asd(TreeNode root,ArrayList<Integer> al){
        root.val = al.get(0);TreeNode curr = root;
        for(int i = 1;i<al.size();i++){
            TreeNode newnode= new TreeNode(al.get(i));
            curr.right=newnode;
            curr=curr.right;
        }
        return root;
    }
    
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){return null;}
        ArrayList<Integer> al = new ArrayList<>();
        al = inc(root,al);
        
        Collections.sort(al);
        root.left = null;
        root.right = null;
        
        
        return asd(root,al);
        
    }
}