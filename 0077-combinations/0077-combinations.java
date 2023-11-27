class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer>al = new ArrayList<>();
        
        check(al,n,k,0);
        return all;
    }
    List<List<Integer>>all = new ArrayList<>();
    
    public void check(ArrayList<Integer>al , int n,int k,int c){
        if(c == n && al.size()==k){all.add(new ArrayList(al));return;}
        if (al.size() > k || c >= n) {
            return;
        }
        if(al.size()>k){return;}
        al.add(c+1);
        check(al,n,k,c+1);
        al.remove(al.size()-1);
        check(al,n,k,c+1);    
    }
}