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
    HashMap<Integer,Integer>hm = new HashMap<>();
    boolean a = true;  
    public void tree(TreeNode root, int n){
        if(root==null){return ;}
        
        tree(root.left,n+1);
        tree(root.right,n+1);
        if((n%2==0 && root.val%2==0) || (n%2!=0 && root.val%2!=0)){a= false;return ;}
        if(hm.containsKey(n)!=true){hm.put(n,root.val);}
        else if(hm.containsKey(n) && n%2==0 && hm.get(n)>=root.val){a =false;return;}
        else if(hm.containsKey(n) && n%2==0 && hm.get(n)<root.val){hm.put(n,root.val);}
        else if(hm.containsKey(n) && n%2!=0 && hm.get(n)<=root.val){a =false;return;}
        else if(hm.containsKey(n) && n%2!=0 && hm.get(n)>root.val){hm.put(n,root.val);}
        
        
    }
    public boolean isEvenOddTree(TreeNode root) {
        tree(root,0);
        return a;
    }
}