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
    
    public void tre(TreeNode root, ArrayList<Integer>al){
        if(root == null){return;}
        if(root.left==null && root.right==null){al.add(root.val);}
        tre(root.left,al);
        tre(root.right,al);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>al = new ArrayList<>();
        ArrayList<Integer>al1 = new ArrayList<>();    
        tre(root1,al);
        // System.out.println(al);
        tre(root2,al1);
        // System.out.println(al1);
        if(al.size() != al1.size()){return false;}
        for(int i = 0;i<al.size();i++){
            if(al.get(i)!= al1.get(i)){return false;}
        }
        return true;
    }
}