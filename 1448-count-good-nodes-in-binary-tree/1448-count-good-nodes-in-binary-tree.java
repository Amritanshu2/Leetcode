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
    PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
    int num = 0;
    public int goodNodes(TreeNode root) {
        trav(root);
        return num;
    }
    
    public void trav(TreeNode root){
        if(root == null){return;}
        pq.add(root.val);
        if(pq.peek() == root.val){num++;}
        trav(root.left);
        trav(root.right);
        pq.remove(root.val);
    } 
}