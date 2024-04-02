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
    TreeNode root;
    
    
    public void build(int lvl, int value){
        if(lvl == 0){
            root = new TreeNode(value);
            return;
        }
        int a = 0;
        TreeNode req = root;
        while(a<lvl-1){
            if(req.right != null){req = req.right;}
            else{
                req = req.left;
            }
            a++;
        }
        if(req.left == null){
            TreeNode temp = new TreeNode(value);
            req.left = temp;
        }
        else{
            TreeNode temp = new TreeNode(value);
            req.right = temp;
        }
    }
    
    
    public TreeNode recoverFromPreorder(String trav) {
        int string = 0;int a = 0;
        
        for(int i = 0;i<=trav.length();i++){
            if(string!=0 &&(i==trav.length() || trav.charAt(i) == '-' )){
                build(a,string);
                string = 0;
                a = 1;continue;
            }
            
            if(i == trav.length()){break;}
            
            if(  trav.charAt(i) != '-'){
                string = string*10 + trav.charAt(i)-'0';
            }
            
            if(trav.charAt(i) == '-'){
                a++;
            }
            
        }
        
        return root;
    }
}