class Solution {
    int result = 0;
    
    public int countPairs(TreeNode root, int distance) {
        countPairsUtil(root, distance);
        return result;
    }
    
    public int[] countPairsUtil(TreeNode root, int distance) {
        if (root == null) return new int[distance + 1];
        
        if (root.left == null && root.right == null) {
            int[] leafDist = new int[distance + 1];
            leafDist[1] = 1;
            return leafDist;
        }
        
        int[] left = countPairsUtil(root.left, distance);
        int[] right = countPairsUtil(root.right, distance);
        
        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance; j++) {
                if (i + j <= distance) {
                    result += left[i] * right[j];
                }
            }
        }
        
        int[] currDist = new int[distance + 1];
        for (int i = 1; i < distance; i++) {
            currDist[i + 1] = left[i] + right[i];
        }
        
        return currDist;
    }
}
