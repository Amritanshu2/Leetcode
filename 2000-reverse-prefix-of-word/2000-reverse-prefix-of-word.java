class Solution {
    public String reversePrefix(String word, char ch) {
        String h ="";int i =0;int j =1;
        while(i<word.length()){
            h = word.charAt(i) + h;i++;
            if(word.charAt(i-1)==ch){j++;break;}
        }
        if(j==1){return word;}
        while(i<word.length()){
            h = h+word.charAt(i);i++;
        }
        return h;
    }
}