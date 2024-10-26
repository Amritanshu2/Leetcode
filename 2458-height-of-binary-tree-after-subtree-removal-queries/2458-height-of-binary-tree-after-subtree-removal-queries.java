class Solution {
    private Map<Integer, Integer> depth = new HashMap<>();
    private Map<Integer, Integer> height = new HashMap<>();
    private Map<Integer, Integer> parentNodes = new HashMap<>();
    private Map<Integer, List<Integer>> maxHeightsAtDepth = new HashMap<>();

    public int[] treeQueries(TreeNode root, int[] queries) {
        computeDepthAndHeight(root, null, 0);

        for (int node : height.keySet()) {
            int d = depth.get(node);
            int h = height.get(node);
            maxHeightsAtDepth.computeIfAbsent(d, k -> new ArrayList<>()).add(h);
        }

        for (List<Integer> heights : maxHeightsAtDepth.values()) {
            Collections.sort(heights, Collections.reverseOrder());
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int node = queries[i];
            result[i] = calculateHeightWithoutSubtree(node);
        }

        return result;
    }

    private int computeDepthAndHeight(TreeNode node, TreeNode parent, int d) {
        if (node == null) return -1;

        depth.put(node.val, d);
        parentNodes.put(node.val, parent == null ? -1 : parent.val);

        int leftHeight = computeDepthAndHeight(node.left, node, d + 1);
        int rightHeight = computeDepthAndHeight(node.right, node, d + 1);
        int h = Math.max(leftHeight, rightHeight) + 1;

        height.put(node.val, h);
        return h;
    }

    private int calculateHeightWithoutSubtree(int node) {
        int nodeDepth = depth.get(node);
        int nodeHeight = height.get(node);

        List<Integer> heightsAtLevel = maxHeightsAtDepth.get(nodeDepth);

        if (heightsAtLevel.size() == 1) {
            return nodeDepth - 1;
        } else {
            return nodeDepth + (heightsAtLevel.get(0) == nodeHeight ? heightsAtLevel.get(1) : heightsAtLevel.get(0));
        }
    }
}
