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
    HashMap<Integer,ArrayList<Integer>>hm = new HashMap<>();
    
    public void asd(TreeNode root, int lvl){
        if(root==null){return;}
        
        if(!hm.containsKey(lvl)){ArrayList<Integer>as = new ArrayList<>();hm.put(lvl,as);}
        hm.get(lvl).add(root.val);
        hm.put(lvl,hm.get(lvl));
        asd(root.left,lvl+1);
        asd(root.right,lvl+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>all = new ArrayList<>();
        asd(root,0);
        for(int i = 0;i<hm.size();i++){
            List<Integer>al = new ArrayList<>();
            if(i%2==0){for(int j = 0;j<hm.get(i).size();j++){
                al.add(hm.get(i).get(j));
            }}
            else{
               for(int j = 0;j<hm.get(i).size();j++){
                al.add(0,hm.get(i).get(j));
            } 
            }
            all.add(al);
            
        }
        System.out.println(hm);
        return all;
    }
}