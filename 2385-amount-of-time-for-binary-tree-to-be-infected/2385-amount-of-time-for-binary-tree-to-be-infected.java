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
    TreeNode Val = null;
    HashMap<Integer,ArrayList<TreeNode>> hm = new HashMap<>();
    public void trav(TreeNode root,TreeNode val){
        if(root == null){return;}
        trav(root.left,root);
        trav(root.right,root);
        ArrayList<TreeNode>al = new ArrayList<>();
        if(root.left != null) al.add((root.left));
        if(root.right != null)al.add((root.right));
        if(val != null){al.add(val);}
        hm.put(root.val,al);
    }
    int df = 0;HashSet<Integer>hs = new HashSet<>();
    public void search(TreeNode root,int start){
        if(root==null){return;}
        if(root.val == start){
             hs.add(root.val);
             df = amt(root);
            return;
        }
        search(root.left,start);
        search(root.right,start);
    }
    
    public int amt(TreeNode root ){
        ArrayList<TreeNode>al = hm.get(root.val);
        if(al.size()==0){return 0;}
        int a = 0,b =0;
        for(int i = 0;i<al.size();i++){
            if(!hs.contains(al.get(i).val)){
                hs.add(al.get(i).val);
                a = amt(al.get(i))+1;
            }
            b = Math.max(a,b);
        }
        return b;
    }
    
    
    public int amountOfTime(TreeNode root, int start) {
        trav(root,Val);
        System.out.println(hm);
        search(root,start);
        return df;
    }
}