class Solution {
    public int possibleStringCount(String word) {
        char c = ' ';
        int freq = 0;int tot = 0;
        String s = "";
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == c){
                freq++;
            }
            else{
               if(freq>1){tot+= freq-1;}
                freq = 1;
                c = word.charAt(i);
            }
        }
        if(freq>1){tot+= freq-1;}
        return tot+1;
    }
}