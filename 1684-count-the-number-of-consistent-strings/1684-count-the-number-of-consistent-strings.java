class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>hs = new HashSet<>();
        for(int i = 0;i<allowed.length();i++){
            hs.add(allowed.charAt(i));
        }
        int count = 0;
        for(int i = 0;i<words.length;i++){
            int s = 0;
            for(int j = 0;j<words[i].length();j++){
                if(!hs.contains(words[i].charAt(j))){s = 1;break;}
            }
            if(s==0){count++;}
        }
        return count;
    }
}