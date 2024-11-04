class Solution {
    HashSet<String>hs;
    char[]c = {'a', 'e', 'i', 'o', 'u'};
    public int countVowelStrings(int n) {

        hs = new HashSet<>();
        
        for(int i = 0;i<5;i++){
            make(c[i]+"",i,n);
        }
        return hs.size();
    }
    
    public void make(String s,int pos, int n){
        if(s.length() == n){hs.add(s);return;}
        
        for(int i = pos;i<5;i++){
            make(s+c[i],i,n);
        }
    }
}