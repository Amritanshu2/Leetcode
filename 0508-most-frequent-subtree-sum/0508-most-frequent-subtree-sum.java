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
    
    public int trav(TreeNode root){
        if(root == null){return 0;}
        int a = trav(root.left);
        int b = trav(root.right);
        hm.put(a+b+root.val,hm.getOrDefault(a+b+root.val,0)+1);
        return a+b+root.val;
        
    }
    
    public int[] findFrequentTreeSum(TreeNode root) {
        trav(root);int max = 0;int sum = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            
            // max = Math.max(max,entry.getValue());
            if(max<entry.getValue()){sum = entry.getKey();max = entry.getValue();}
            
        }
        int a = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(max == entry.getValue()){a++;}
        }
        if(a>1){
                List<Integer>al = new ArrayList<>();
                for (Map.Entry<Integer, Integer> ent : hm.entrySet()) {
                    if(ent.getValue() == max){al.add(ent.getKey());}
                    
                }
            int[] array = new int[al.size()];
            for(int i = 0;i<al.size();i++){
                array[i] = al.get(i);
            }
                return array;
                                       }
        
        int[]arr = {sum};
        return arr ;
        
    }
}