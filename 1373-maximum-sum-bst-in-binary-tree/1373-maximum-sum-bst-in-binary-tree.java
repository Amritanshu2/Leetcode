class Solution {
    int max = 0;
    
    public int maxSumBST(TreeNode root) {
        helper(root);
        return max;
    }
    
    private int[] helper(TreeNode node) {
        // base case: empty node is a valid BST with sum 0
        if (node == null) {
            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0}; // {isBST, min, max, sum}
        }
        
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        
        if (left[0] == 1 && right[0] == 1 && node.val > left[2] && node.val < right[1]) {
            int sum = node.val + left[3] + right[3];
            max = Math.max(max, sum);
            int minVal = node.left != null ? left[1] : node.val;
            int maxVal = node.right != null ? right[2] : node.val;
            return new int[]{1, minVal, maxVal, sum};
        } else {
            return new int[]{0, 0, 0, 0}; // not a BST
        }
    }
}
