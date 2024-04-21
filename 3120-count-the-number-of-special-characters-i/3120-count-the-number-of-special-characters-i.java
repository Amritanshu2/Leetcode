class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Integer>hs = new HashSet<>();int total = 0;
        for(int i = 0;i<word.length();i++){
            hs.add((int)word.charAt(i));
        }
        
        for(int i = 0;i<word.length();i++){
            if((hs.contains((int)word.charAt(i)) && hs.contains((int)word.charAt(i)-32)) || (hs.contains((int)word.charAt(i)) && hs.contains((int)word.charAt(i)+32))){total++;}
            hs.remove((int)word.charAt(i));
        }
        return total;
    }
}