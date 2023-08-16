/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    
    public List<Integer> low(TreeNode root, int k, List al , HashSet hs){
        
        if(root == null){return al;}
        if(k == 0){
            al.add(root.val);
            return al;
        }
        if(hs.contains(root.left)!=true){
        low(root.left,k-1,al,hs);}
        if(hs.contains(root.right)!=true){
        low(root.right,k-1,al,hs);}
        return al;
        
    }
    
    public List<Integer> dist(TreeNode root, TreeNode target, int k, List al ,HashSet hs){
        if(root == null){return new ArrayList<>();}
        if(root.val == target.val){
            ArrayList<Integer> base = new ArrayList<>();
            low(root , k - base.size() , al ,hs);
            hs.add(root);
            base.add(root.val);
            return base;
        }
        List<Integer> lft = dist(root.left,target,k,al ,hs);
        if(lft.size()>0){
            low(root , k - lft.size() , al,hs);
            hs.add(root);
            lft.add(root.val);
            return lft;
        }
        
        List<Integer> rit = dist(root.right,target,k,al ,hs);
        if(rit.size()>0){
            low(root , k - rit.size() , al,hs);
            hs.add(root);
            rit.add(root.val);
            return rit;
        }
        
        return new ArrayList<>();
        
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>al = new ArrayList<>();
        HashSet<TreeNode>hs = new HashSet<>();
        dist(root,target,k,al,hs);
        return al;
    }
}