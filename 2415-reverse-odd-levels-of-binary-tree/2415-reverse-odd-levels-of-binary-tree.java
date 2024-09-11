class Solution {
    
    HashMap<Integer,ArrayList<TreeNode>>hm = new HashMap<>();int size = 0;
    
    public TreeNode reverseOddLevels(TreeNode root) {
        trav(root,0);
        for(int i1 = 0;i1<=size;i1++){
            if(i1%2 != 0){
                ArrayList<TreeNode>al = hm.get(i1);int s = al.size()-1;
                for(int i = 0;i<al.size()/2;i++){
                    int n1 = al.get(i).val;
                    al.get(i).val =al.get(s-i).val;
                    al.get(s-i).val = n1;
                }
            }
        }
        return root;
    }
    
    public void trav(TreeNode root, int lvl){
        if(root == null)return;
        size = Math.max(size,lvl);
        if(lvl%2 != 0){
            if(!hm.containsKey(lvl)){hm.put(lvl,new ArrayList<TreeNode>());}
            hm.get(lvl).add(root);
        }
        trav(root.left,lvl+1);
        trav(root.right,lvl+1);
    }
    
}