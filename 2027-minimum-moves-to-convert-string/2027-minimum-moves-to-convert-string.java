class Solution {
    public int minimumMoves(String s) {
        int i = 0;int ans = 0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                ans++;i+=3;
            }
            else{i++;}
        }
        return ans;
    }
}


// XOXOXO