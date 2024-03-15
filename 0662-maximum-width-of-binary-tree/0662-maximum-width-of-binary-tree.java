import java.util.*;

class Solution {
    HashMap<Integer, Integer> leftmostPositions = new HashMap<>();
    int maxWidth = 0;

    public int widthOfBinaryTree(TreeNode root) {
        traverse(root, 0, 1);
        return maxWidth;
    }

    private void traverse(TreeNode node, int level, int position) {
        if (node == null) {
            return;
        }

        
        leftmostPositions.putIfAbsent(level, position);

      
        maxWidth = Math.max(maxWidth, position - leftmostPositions.get(level) + 1);

        
        traverse(node.left, level + 1, position * 2);
        traverse(node.right, level + 1, position * 2 + 1);
    }
}
