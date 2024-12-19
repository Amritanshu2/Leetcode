class Solution {
    
    HashMap<String,Integer>dp = new HashMap<>();
    public int minCut(String s) {
        if (s.length() == 0 || isPalindrome(s)) { 
            return 0;
        }
        if(dp.containsKey(s)){return dp.get(s);}
        int min = s.length();
        for(int i = s.length();i>0;i--){
            if(isPalindrome(s.substring(0,i))){
                min = Math.min(min,minCut(s.substring(i))+1);
            }
            if(min == 1){return 1;}
        }
        dp.put(s,min);
        return min;
    }
    public boolean isPalindrome(String str){
        
        
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}