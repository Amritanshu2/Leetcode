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
    
    HashMap<Integer,List<TreeNode>>hm = new HashMap<>();
    
    public List<TreeNode> allPossibleFBT(int n) {
        if(n%2 ==0)return new ArrayList<>();
        if(hm.containsKey(n)){return hm.get(n);}
        List<TreeNode>al = new ArrayList<>();
        if(n ==1 ){al.add(new TreeNode(0));return al;}
        for(int i = 1;i<n;i+=2){
            List<TreeNode>left = allPossibleFBT(i);
            List<TreeNode>right = allPossibleFBT(n-1-i);
            for(int i1 = 0;i1<left.size();i1++){
                for(int j = 0;j<right.size();j++){
                    TreeNode root = new TreeNode(0);
                    root.left = left.get(i1);
                    root.right = right.get(j);
                    al.add(root);
                }
            }
        }
        hm.put(n,al);
        return al;
    }
}