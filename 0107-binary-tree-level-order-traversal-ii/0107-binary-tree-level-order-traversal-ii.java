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
    
    public HashMap<Integer,ArrayList<Integer>> ans(TreeNode root , HashMap<Integer, ArrayList<Integer>> hm , int n ){
        if(root == null){
            return hm;
        }
        if(hm.containsKey(n)){
            ArrayList al = hm.get(n);
            al.add(root.val);
            hm.put(n,al);
        }
        else{
            ArrayList<Integer> al =  new ArrayList<>();
            al.add(root.val);
            hm.put(n,al);
            
        }
        ans(root.left,hm,n+1);
        ans(root.right,hm,n+1);
        return hm;
        
        
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        hm = ans(root,hm,0);
        List<List<Integer>> al = new ArrayList<>();
        for(int i = hm.size()-1;i>=0;i--){
            al.add(hm.get(i));
        }
        return al;
    }
}