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
    HashMap<Integer,Long> hm = new HashMap<>();
    
    public void he(TreeNode root, int l){
        if(root == null){return ;}
        if(hm.containsKey(l)){
            hm.put(l,hm.get(l)+root.val);
        }
        else{
            long a = 0;
            hm.put(l,a+root.val);
        }
        he(root.left,l+1);
        he(root.right,l+1);
        
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        he(root,1);
        PriorityQueue<Long>pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (Integer key : hm.keySet()) {
            pq.add(hm.get(key));
        }
        if(k>pq.size()){return -1;}
        for(int i = 0;i<k-1;i++){
             pq.remove();
        }
        return pq.remove();
    }
}