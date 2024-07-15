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
    public TreeNode createBinaryTree(int[][] des) {
        HashMap<Integer,TreeNode> hm = new HashMap<>();
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<des.length;i++){
            hs.add(des[i][1]);
            if(hm.containsKey(des[i][0])){
                if(des[i][2] == 0){
                    if(hm.containsKey(des[i][1])){hm.get(des[i][0]).right = hm.get(des[i][1]);}
                    else{hm.get(des[i][0]).right = new TreeNode(des[i][1]);hm.put(des[i][1],hm.get(des[i][0]).right);}
                }
                else{
                    if(hm.containsKey(des[i][1])){hm.get(des[i][0]).left = hm.get(des[i][1]);}
                    else{hm.get(des[i][0]).left = new TreeNode(des[i][1]);hm.put(des[i][1],hm.get(des[i][0]).left);}
                }
            }
            else{
                TreeNode temp = new TreeNode(des[i][0]);
                hm.put(des[i][0],temp);
                if(des[i][2] == 0){
                    if(hm.containsKey(des[i][1])){temp.right = hm.get(des[i][1]);}
                    else{temp.right = new TreeNode(des[i][1]);hm.put(des[i][1],temp.right);}
                }
                else{
                    if(hm.containsKey(des[i][1])){temp.left = hm.get(des[i][1]);}
                    else{temp.left = new TreeNode(des[i][1]);hm.put(des[i][1],temp.left);}
                }
            }
        }
        
        for (Map.Entry<Integer, TreeNode> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            if(!hs.contains(key)){return hm.get(key);}
        }
        return null;
        
    }
    
    
}