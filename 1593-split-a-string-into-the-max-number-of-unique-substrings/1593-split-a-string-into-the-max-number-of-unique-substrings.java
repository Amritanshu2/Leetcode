class Solution {
    
    int max = 0;
    
    public int maxUniqueSplit(String s) {
        check(s,0,new HashSet<>());
        return max;
    }
    
    public void check(String s, int pos, HashSet<String>hs){
        if(pos == s.length()){max = Math.max(max,hs.size());}
        
        String a = "";
        for(int i = pos;i<s.length();i++){
            a+= s.charAt(i);
            if(!hs.contains(a)){
                hs.add(a);
                check(s,i+1,hs);
                hs.remove(a);
            }
        }
    }
}