class Solution {
    int[][]arr;
    public int longestCommonSubsequence(String text1, String text2) {
        arr = new int[text1.length()+1][text2.length()+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -1;
            }
        }
        return longest(text1, 0, text2, 0);
    }
    
    public int longest(String s1, int i, String s2, int j){
        if(i>=s1.length() || j>=s2.length()){return 0;}
        
        if(arr[i][j]!=-1){return arr[i][j];}
        
        if(s1.charAt(i) == s2.charAt(j)){
            return arr[i][j] = longest(s1,i+1,s2,j+1)+1;
        }
        
        else{
            int a = longest(s1,i,s2,j+1);
            int b = longest(s1,i+1,s2,j);
            return arr[i][j] = Math.max(a,b);
        }
        
    }
}