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
    int tot = 0;
    public int pathSum(TreeNode root, int targetSum) {
        
        check(root,targetSum,new ArrayList<>());
        return tot;
    }
    public void check(TreeNode root,int target,List<Integer>al){
        if (root == null) {
            return;
        }
        al.add(root.val);
        long sum = 0;
        for (int i = al.size() - 1; i >= 0; i--) {
            sum += al.get(i);
            if (sum == target) {
                tot++;
            }
        }
        check(root.left, target, new ArrayList<>(al));
        check(root.right, target, new ArrayList<>(al));
    }
}