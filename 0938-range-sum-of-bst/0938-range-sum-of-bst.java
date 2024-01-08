class Solution {
    int k = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);
        if(root.val>=low && root.val<=high){
            k = k+ root.val;
        }
        return k;
        
    }
}