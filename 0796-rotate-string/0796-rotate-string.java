class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!= s.length())return false;
        int start = 0;
        for(int i = 0;i<goal.length();i++){
            if(goal.charAt(i) == s.charAt(0)){if(check(s,goal,i))return true;}
        }
        return false;
        
    }
    public boolean check(String s, String goal, int start){
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt((start+i)%goal.length())){return false;}
        }
        return true;
    }
}