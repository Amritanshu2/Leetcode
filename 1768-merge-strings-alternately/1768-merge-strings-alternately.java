class Solution {
    public String mergeAlternately(String w, String w1) {
        String s ="";
        while(w.length()!=0 && w1.length()!=0){
            s = s + w.charAt(0);
            s = s + w1.charAt(0);
            w = w.substring(1);
            w1 = w1.substring(1);
        }
        while(w.length()!=0){
            s = s + w.charAt(0);
            w = w.substring(1);
        }
        
        while(w1.length()!=0){
            s = s + w1.charAt(0);
            w1 = w1.substring(1);
        }
        return s;
    }
}