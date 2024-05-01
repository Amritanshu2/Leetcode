class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;int j = 0;String a = "";
        while(i<word.length() && word.charAt(i)!= ch ){
            i++;
        }
        j = i+1;
        if(i == word.length()){return word;}
        while(i>=0){
            a += word.charAt(i);i--;
        }
        while(j<word.length()){
            a+= word.charAt(j);j++;
        }
        return a;
    }
}