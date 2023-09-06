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
    
    public void pub(TreeNode root,int n){
        if(root == null){return;}
        if(hm.containsKey(n) != true){ArrayList<Integer> sd = new ArrayList<>();
            sd.add(root.val);
            hm.put(n,sd);}
        else{
            hm.get(n).add(root.val);
        }
        pub(root.left,n+1);
        pub(root.right,n+1);
        
    }
    
    public List<Double> averageOfLevels(TreeNode root) {
        pub(root,0);
        ArrayList<Double>al = new ArrayList<>();
        for (Map.Entry<Integer,ArrayList<Integer>> mapElement : hm.entrySet()) {
            int key = mapElement.getKey();
            ArrayList<Integer> fg = hm.get(key);Double s = 0D;
            for(int i = 0;i<fg.size();i++){
                s = s + fg.get(i);
            }
            al.add(s/fg.size());
        }
        return al;
    }
}