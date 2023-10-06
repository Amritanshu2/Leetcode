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
    Stack<Integer> st =  new Stack<>();
    
    public void Linked(TreeNode root){
        if(root == null){return ;}
        Linked(root.right);
        Linked(root.left);
        st.push(root.val);
        
    }
    
    public void flatten(TreeNode root) {
        if(root==null){return;}
        Linked(root);
       
        root.val = st.pop();
        root.left = null;
        TreeNode temp = root;
        
        System.out.print(st.size());
        while(!st.empty()){
            
            TreeNode rew = new TreeNode();
            rew.val = st.pop();
            temp.right = rew;
            temp = temp.right;
        }
        
        
    }
}