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
    
    public TreeNode trim(TreeNode root, int low) {
        if (root == null) {
            return null;
        }
        
        if (root.val < low) {            
            return trim(root.right, low);
        }
        
        
        root.left = trim(root.left, low);
        root.right = trim(root.right, low);        
        return root;
    }
    
    public TreeNode trim1(TreeNode root, int high) {
        if (root == null) {
            return null;
        }
        
        if (root.val > high) {
            
            return trim1(root.left, high);
        }
        
       
        root.left = trim1(root.left, high);
        root.right = trim1(root.right, high);
        
        return root;
    }
    
    public TreeNode trimBST(TreeNode root, int low, int high) {
        root = trim(root, low);
        root = trim1(root, high);
        return root;
    }
}
// class Solution {
    
//     public TreeNode trim(TreeNode root,int low){
//         if(root == null){return null;}
//         if(root.val<low){
//             root.left = null;
//             root = root.right;
//             return root;
//         }
//         trim(root.left,low);
//         return root;
//     }
    
//     public TreeNode trim1(TreeNode root,int high){
//         if(root == null){return null;}
//         if(root.val>high){
//             root.right = null;
//             root = root.left;
//             return root;
//         }
//         trim1(root.right,high);
//         return root;
//     }
    
//     public TreeNode trimBST(TreeNode root, int low, int high) {
//         root = trim(root,low);
//         root = trim1(root,high);
//         return root;
//     }
// }