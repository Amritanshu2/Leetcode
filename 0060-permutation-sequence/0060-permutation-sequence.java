class Solution {
    // ArrayList<String>al = new ArrayList<>();
    // int kj ;
    // public void check(int n,String s,int i ){
    //     if(i == n){al.add(s);kj--; return;}
    //     if(kj ==0){return;}
    //     for(int j = 1;j<=n;j++){
    //         if(!s.contains(String.valueOf(""+j))){
    //             check(n,s+j,i+1);
    //         }
    //     }
    // }
    
    
    
    public String getPermutation(int n, int k) {
       
        
        // check(n,s,0);
        // return al.get(k - 1);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            al.add(i);
        }
        check2(al,k,n);
        return s;
    }
   public int fact[] = {1,1,2,6,24,120,720,5040,40320,362880};
    
    String s = "";
    public void check2(ArrayList<Integer>al,int k,int n){
        if(n==1){s += al.get(0);return;}
        int index = k/fact[n-1];
        if(k%fact[n-1]==0){index = index-1;}
        s = s + al.get(index);
        al.remove(index);
        k = k - fact[n-1]*index;
        check2(al,k,n-1);
        
    }
}