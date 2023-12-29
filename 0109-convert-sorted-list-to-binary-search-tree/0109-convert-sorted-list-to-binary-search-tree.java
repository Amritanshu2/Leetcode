/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public TreeNode tree(Integer[] nums, int i ,int j ) {
        if(i>j)return null;
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tree(nums,i ,mid-1);
        root.right = tree(nums,mid+1,j);
        return root;
        
    }
    
    public ArrayList<Integer> array(ListNode head){
        ArrayList<Integer>al = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null){
            al.add(temp.val);
            temp = temp.next;
        }
        return al;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        
        
        Integer[] nums = array(head).toArray(new Integer[0]);
        return tree(nums,0,nums.length-1);
        
    }
}