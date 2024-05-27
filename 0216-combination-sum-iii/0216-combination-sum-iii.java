class Solution {
    
    HashSet<List<Integer>> al = new HashSet<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        hlpr(n,k,0,new HashSet<>(),0);
        return new ArrayList<>(al);
    }
    
    
    public void hlpr(int tar, int maxs, int curr, HashSet<Integer>hs, int tot){
        if(curr == maxs){
            if(tot == tar){al.add(new ArrayList<>(hs));}
            return;
        }
        for(int i = 1;i<=9;i++){
            if(hs.contains(i)){continue;}
            hs.add(i);
            hlpr(tar,maxs,curr+1,hs,tot+i);
            hs.remove(i);
        }
    }
}