*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
class Solution {
public static class node{
TreeNode parent;
TreeNode child;
node(TreeNode child, TreeNode parent){
parent = this.parent;
child = this.child;
}
}
int max = 0;
HashMap<Integer,List<node>>hm = new HashMap<>();
public void trav(TreeNode root,TreeNode p,int lvl){
if(root == null){
return;
}
max = Math.max(lvl,max);
if(hm.containsKey(lvl)){
List<node>al = hm.get(lvl);
al.add( new node(root,p));
hm.put(lvl,al);
}
else{
List<node>al =new ArrayList<>();
al.add( new node(root,p));
hm.put(lvl,al);
}
trav(root.left,root,lvl+1);
trav(root.right,root,lvl+1);
}
HashSet<TreeNode> common = new HashSet<>();
TreeNode com ;
public void check(node root){
while(root.parent!= null ){
if(common.contains(root.parent)){com = root.parent;break;}
common.add(root.parent);
root.child = root.parent;
}
}
public TreeNode subtreeWithAllDeepest(TreeNode root) {
trav(root,null,0);