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
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

class Solution {
    int maxPathSum = Integer.MIN_VALUE;
    Map<TreeNode, Integer> nodeMaxSums = new HashMap<>();

    public int max(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (nodeMaxSums.containsKey(root)) {
            return nodeMaxSums.get(root);
        }

        int leftSum = max(root.left);
        int rightSum = max(root.right);

        int nodePathSum = Math.max(root.val, Math.max(root.val + leftSum, root.val + rightSum));
        int maxPathSumThroughNode = Math.max(nodePathSum, root.val + leftSum + rightSum);

        maxPathSum = Math.max(maxPathSum, maxPathSumThroughNode);
        nodeMaxSums.put(root, nodePathSum);

        return nodePathSum;
    }

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        max(root);
        return maxPathSum;
    }
}
