class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        
        if (checkPath(root, head)) return true;
        
        return isSubPath( head,root.left) || isSubPath( head, root.right);
    }


    private boolean checkPath(TreeNode node, ListNode head) {
        if (head == null) return true; 
        if (node == null) return false; 
        
        
        if (node.val != head.val) return false;
        
        
        return checkPath(node.left, head.next) || checkPath(node.right, head.next);
    }
}
