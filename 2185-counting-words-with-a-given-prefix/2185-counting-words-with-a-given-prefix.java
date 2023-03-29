class Solution {
    public int prefixCount(String[] words, String pref) {
        int num = 0;String str = "";
        for(int i = 0;i<words.length;i++){
            str = "";
            if(words[i].length()<pref.length()){
                continue;
            }
            str = words[i].substring(0,pref.length());
            if(str.contains(pref)){
                num++;
            }
        }
        return num;
    }
}