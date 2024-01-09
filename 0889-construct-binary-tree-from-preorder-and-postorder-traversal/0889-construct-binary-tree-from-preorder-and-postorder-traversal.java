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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return sol(preorder, postorder);
    }
    int pre = 0;
    int post = 0;

    TreeNode sol(int[] PRE, int[] POST){
        

        int val = PRE[pre];
        
        TreeNode n = new TreeNode(val);
        pre+=1;
        if (n.val != POST[post]) {
            n.left = sol(PRE, POST);
        }
        if (n.val != POST[post]) {
            n.right = sol(PRE, POST);
        }
        post+=1;
        return n;
    }
}