/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode tree(ArrayList<Integer> p, ArrayList<Integer> i) {
        // Base case: if the list has only one element, create a new TreeNode
        if (p.size() == 1) {
            TreeNode re = new TreeNode(p.get(0));
            return re;
        }
        // Additional base case: if the list is empty, return null
        if (p.size() == 0) {
            return null;
        }
        
        TreeNode head = new TreeNode(p.get(0));
        ArrayList<Integer> d = new ArrayList<>();

        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> d1 = new ArrayList<>();
        int g = 0;
        while (i.get(g) != head.val) {
            d.add(i.get(g));
            hs.add(i.get(g));
            g++;
        }
        g++;
        while (g < i.size()) {
            d1.add(i.get(g));
            g++;
        }
        int gf = 0;
        ArrayList<Integer> d2 = new ArrayList<>();
        ArrayList<Integer> d3 = new ArrayList<>();

        while (gf < i.size()) {
            if (hs.contains(p.get(gf))) {
                d2.add(p.get(gf));
            } else if (p.get(gf) != head.val) {
                d3.add(p.get(gf));
            }
            gf++;
        }
        head.left = tree(d2, d);
        head.right = tree(d3, d1);
        return head;
    }

    public TreeNode buildTree(int[] pr, int[] ir) {
    ArrayList<Integer> p = new ArrayList<>();
    ArrayList<Integer> i2 = new ArrayList<>();

    for (int i = 0; i < pr.length; i++) {
        p.add(pr[i]);
    }

    for (int i = 0; i < ir.length; i++) {
        i2.add(ir[i]);
    }

    return tree(p, i2);
}

}
