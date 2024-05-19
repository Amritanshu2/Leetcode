class Solution {
    
    HashMap<Long,List<Long>>hm = new HashMap<>();
    int a = 0;long max = 0;
    public int countHighestScoreNodes(int[] par) {
        TreeNode root = createTree(par);
        a = par.length;
        trav(root);
        return hm.get(max).size();
    }
    
    public int trav(TreeNode root){
        if(root == null){return 0;}
        int left = trav(root.left);
        int right = trav(root.right);
        long s = 1;
        if(left!=0){
            s*=left;
        }
        if(right!=0)s*=right;
        if(a-left-right-1!=0) s*=(a-left-right-1);
        max = Math.max(s,max);
        if(hm.containsKey(s)){List<Long>al = hm.get(s);al.add(s);hm.put(s,al);}
        else{List<Long>al = new ArrayList<>();al.add(s);hm.put(s,al);}
        return left+right+1;
    }
    
    public TreeNode createTree(int[] parents) {
        int n = parents.length;
        TreeNode[] nodes = new TreeNode[n];
        
        for (int i = 0; i < n; i++) {
            nodes[i] = new TreeNode(i);
        }

        TreeNode root = null;
        
        for (int i = 0; i < n; i++) {
            if (parents[i] == -1) {
                root = nodes[i];  // The root node
            } else {
                TreeNode parent = nodes[parents[i]];
                if (parent.left == null) {
                    parent.left = nodes[i];
                } else {
                    parent.right = nodes[i];
                }
            }
        }
        
        return root;
    }
}