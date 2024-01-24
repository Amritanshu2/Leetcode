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
    
    List<HashMap<Integer,Integer>>al = new ArrayList<>();
    
    public void traverse(TreeNode root,HashMap<Integer,Integer>a){
        if(root == null){return;}
        a.put(root.val,a.getOrDefault(root.val,0)+1);
        if(root.left == null && root.right == null){
            al.add(new HashMap<>(a));
            a.put(root.val,a.get(root.val)-1);
            return;
        }
        traverse(root.left,a);
        traverse(root.right,a);
        
            a.put(root.val,a.get(root.val)-1);
    }
    
     public int check(){
        int count = 0;
        for(int i = 0;i<al.size();i++){
            int odd = 0;
            for (Map.Entry<Integer, Integer> entry : al.get(i).entrySet()) {
                if(entry.getValue()%2!=0){odd++;}
            }
            if(odd<=1){count++;}
        }
        return count;
    }
    
    public int pseudoPalindromicPaths (TreeNode root) {
        traverse(root,new HashMap<>());
        System.out.println(al);
        return check();
    }
}