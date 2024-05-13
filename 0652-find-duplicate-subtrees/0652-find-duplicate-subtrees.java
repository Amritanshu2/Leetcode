import java.util.*;

class Solution {
    Map<String, Integer> subtreeCount;
    List<TreeNode> duplicates;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        subtreeCount = new HashMap<>();
        duplicates = new ArrayList<>();
        dfs(root);
        return duplicates;
    }

    private String dfs(TreeNode node) {
        if (node == null) return "#";

        String left = dfs(node.left);
        String right = dfs(node.right);
        
        String subtree = node.val + "," + left + "," + right;

        subtreeCount.put(subtree, subtreeCount.getOrDefault(subtree, 0) + 1);
        if (subtreeCount.get(subtree) == 2) {
            duplicates.add(node);
        }
        
        return subtree;
    }
}
