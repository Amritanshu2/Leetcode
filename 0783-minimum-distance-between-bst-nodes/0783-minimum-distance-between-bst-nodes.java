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
    int min = (int)1e9;
    ArrayList<Integer>al= new ArrayList<>();
    
    public void get(TreeNode root){
        if(root == null){return ;}
        al.add(root.val);
        get(root.left);
        get(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        get(root);
        for(int i = 0;i<al.size();i++){
            for(int j = i+1;j<al.size();j++){
                if(Math.abs(al.get(i)-al.get(j)) < min){min = Math.abs(al.get(i)-al.get(j));}
            }
        }
        return min;
    }
}