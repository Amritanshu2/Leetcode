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
    List<String>al = new ArrayList<>();
    public String smallestFromLeaf(TreeNode root) {
        check(root,"");
        
        Collections.sort(al);
        return al.get(0);
    }
    
    public void check(TreeNode root, String s){
        if(root == null){al.add(s);return;}
        char a = (char)((int)'a' + root.val);
        if(root.left != null && root.right == null){check(root.left,a+s);return;}
        if(root.left == null && root.right != null){check(root.right,a+s);return;}
        check(root.left,a+s);
        check(root.right,a+s);
    }
    
}