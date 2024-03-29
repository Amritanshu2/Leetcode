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
class FindElements {
    HashSet<Integer>hs = new HashSet<>();
    public TreeNode trav(TreeNode root,int val){
        if(root.left != null){root.left.val = 2*val+1;hs.add(2*val+1);root.left = trav(root.left,2*val+1);}
        if(root.right != null){root.right.val = 2*val+1;hs.add(2*val+2);root.right = trav(root.right,2*val+2);}
        return root;
        
    }

    public FindElements(TreeNode root) {
        if(root!=null){
        hs.add(0);
        root.val = 0;
        trav(root,0);}
    }
    
    public boolean find(int target) {
        if(hs.contains(target)){return true;}
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */