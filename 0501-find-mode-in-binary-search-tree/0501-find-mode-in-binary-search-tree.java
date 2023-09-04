class Solution {
    int maxcount=1;
    public int[] findMode(TreeNode root) {
        HashMap<Integer , Integer> map=new HashMap<>();
        FindMode(root , map);
        ArrayList<Integer> list=new ArrayList<>();
        
        
        
        for(Integer key : map.keySet()){
            if(map.get(key)==maxcount){
                list.add(key);
            }
        }
        
        int ans[]=new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            ans[j] = list.get(j);
        }
        return ans;
        

    }
    public void FindMode(TreeNode root , HashMap<Integer , Integer>map){
        if(root==null){
            return;
        }else if(map.containsKey(root.val)){
            int count=map.get(root.val)+1;
            map.put(root.val , count);
            maxcount=Math.max(count , maxcount);

        }else{
            map.put(root.val ,1);
        }
        FindMode(root.left , map);
        FindMode(root.right , map);
    }
}