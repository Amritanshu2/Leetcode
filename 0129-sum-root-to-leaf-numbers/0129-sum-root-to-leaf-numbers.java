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
    ArrayList<Integer>al = new ArrayList<>();
    
    public void tree(TreeNode root,int a){
        if(root!=null && root.left==null && root.right == null){
            a = a*10+root.val;
            al.add(a);
            return;
        }
        if(root == null){
            // al.add(a);
            return ;}
        tree(root.left,a*10+root.val);
        tree(root.right,a*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
        tree(root,0);int sum = 0;
        for(int i = 0;i<al.size();i++){
            System.out.println(al.get(i));
            sum +=al.get(i);
        }
        return sum;
    }
}