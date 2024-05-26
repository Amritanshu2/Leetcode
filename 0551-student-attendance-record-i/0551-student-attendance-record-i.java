class Solution {
    public boolean checkRecord(String s) {
        int abs = 0;int late = 0;
        for(int i = 0;i<s.length();i++){
            
            if(s.charAt(i) == 'A'){abs++;late=0;}
            if(s.charAt(i) == 'L'){late++;}
            else{late = 0;}
            if(late>2||abs ==2){return false;}
        }
        return true;
    }
}