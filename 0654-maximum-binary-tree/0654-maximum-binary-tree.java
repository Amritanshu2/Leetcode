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
    
    public TreeNode cons(ArrayList<Integer>al){
        if(al.size()==0){return null;}
        int j = 0;
        ArrayList<Integer> copy = new ArrayList<>(al);
        Collections.sort(copy);
        for(int i = 0;i<al.size();i++){
            if(al.get(i) == copy.get(al.size()-1)){j = i;break;}
        }
        ArrayList<Integer>ls = new ArrayList<>();
        ArrayList<Integer>rs = new ArrayList<>();
        for(int i = 0;i<j;i++){
            ls.add(al.get(i));
        }
        for(int i = j+1;i<al.size();i++){
            rs.add(al.get(i));
        }
        TreeNode root = new TreeNode(copy.get(al.size()-1));
        root.left = cons(ls);
        root.right = cons(rs);
        return root;
        
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int[] num = Arrays.copyOf(nums, nums.length);
        int j = 0;
        Arrays.sort(num);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==num[num.length-1]){j=i;break;}
        }
        ArrayList<Integer>ls = new ArrayList<>();
        ArrayList<Integer>rs = new ArrayList<>();
        for(int i = 0;i<j;i++){
            ls.add(nums[i]);
        }
        for(int i = j+1;i<nums.length;i++){
            rs.add(nums[i]);
        }
        TreeNode root = new TreeNode(nums[j]);
        root.left = cons(ls);
        root.right = cons(rs);
        return root;
    }
}