class Solution {
    
    public boolean doesAliceWin(String s) {
        int a = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){a++;}
        }
        
        if(a%2 != 0){return true;}
        if(a == 0){return false;}
        
        return hlpr(s,a,0,0);
        // return false;
        
    }
    
    public boolean hlpr(String s, int a, int idx, int per){
        if(idx == s.length()){if(per%2!=0)return true; return false;}
        int num = 0;boolean sd = false;
        for(int i = idx; i<s.length() && sd == false; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){a++;}
            if(per%2==0 && num%2!=0){sd = hlpr(s,a-num,i+1,per+1);}
            else if(per%2!=0 && num%2==0){sd = hlpr(s,a-num,i+1,per+1);}
        }
        return true;
    }
}