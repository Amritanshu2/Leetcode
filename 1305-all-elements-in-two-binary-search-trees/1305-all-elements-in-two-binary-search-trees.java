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
    
    public void get(TreeNode root,ArrayList<Integer>al){
        if(root==null){return;}
        al.add(root.val);
        get(root.left,al);
        get(root.right,al);
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>al = new ArrayList<>();
        get(root1,al);
        get(root2,al);
        Collections.sort(al);
        return al;
    }
}