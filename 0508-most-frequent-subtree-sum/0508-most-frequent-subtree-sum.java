class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();

    public int trav(TreeNode root) {
        if (root == null) return 0;

        int leftSum = trav(root.left);
        int rightSum = trav(root.right);
        int sum = leftSum + rightSum + root.val;

        hm.put(sum, hm.getOrDefault(sum, 0) + 1);

        return sum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        trav(root);

        List<Integer> result = new ArrayList<>();
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                result.clear();
                result.add(entry.getKey());
                maxFrequency = frequency;
            } else if (frequency == maxFrequency) {
                result.add(entry.getKey());
            }
        }

        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }
}