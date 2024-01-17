class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            for(int j=i;j<word.length();j++){
                String s = word.substring(i,j+1);
                if(s.length()>=5){
                    if(vowel(s)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean vowel (String c){
        int a=0,e=0,i=0,o=0,u=0,t=0;
        for(int j=0;j<c.length();j++){
            if(c.charAt(j)=='a') a++; 
            else if(c.charAt(j)=='e') e++;
            else if(c.charAt(j)=='i') i++;
            else if(c.charAt(j)=='o') o++;
            else if(c.charAt(j)=='u') u++;
            else t++;
        }
        if(a!=0 && e!=0 && i!=0 && o!=0 && u!=0 && t==0) return true;
        else return false;
    }
}