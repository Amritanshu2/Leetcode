class Solution {
    public TreeNode bstFromPreorder(int[] pre) {
        TreeNode root =new TreeNode(pre[0]);
        for(int i = 0;i<pre.length;i++){
            crt(root,pre[i]);
        }
        return root;
    }
    
    public TreeNode crt(TreeNode root,int i){
        if(root == null){return null;}
        if(i < root.val && root.left == null){root.left = new TreeNode(i);return root;}
        if(i> root.val && root.right == null){root.right = new TreeNode(i);return root;}
        if(root.val >i){crt(root.left,i);}
        else{crt(root.right,i);}
        return root;
    }
}