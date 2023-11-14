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
class Solution {
    
    public TreeNode tree(ArrayList<Integer> i, ArrayList<Integer> p) {
        // Base case: if the list is empty, return null
        if (i.size() == 0) {
            return null;
        }
        // Additional base case: if the list has only one element, create a new TreeNode
        if (i.size() == 1) {
            TreeNode as = new TreeNode(i.get(0));
            return as;
        }
        
        TreeNode head = new TreeNode(p.get(p.size() - 1));
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
        head.left = tree(d, d2);
        head.right = tree(d1, d3);
        return head;
    }
    
    public TreeNode buildTree(int[] in, int[] post) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < in.length; i++) {
            al.add(in[i]);
            all.add(post[i]);
        }
        return tree(al, all);
    }
}
