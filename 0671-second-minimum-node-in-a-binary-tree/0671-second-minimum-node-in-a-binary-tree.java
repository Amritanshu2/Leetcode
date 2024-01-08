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
    HashSet<Integer>hs = new HashSet<>();
    
    public void tra(TreeNode root){
        if(root == null){return;}
        
        tra(root.left);
        hs.add(root.val);
        tra(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        tra(root);
        ArrayList<Integer>al = new ArrayList<>(hs);
        
        Collections.sort(al);
        // System.out.println(hs);
        if(al.size()<2){return -1;}
        return al.get(1);
    }
}