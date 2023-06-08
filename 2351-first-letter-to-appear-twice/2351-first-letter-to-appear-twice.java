class Solution {
    public char repeatedCharacter(String s) {
        int m = 0;
        HashMap <Character,Integer> hm = new HashMap<>();
        while(m < s.length()){
            if(hm.containsKey(s.charAt(m))){return s.charAt(m);}
            else{
                hm.put(s.charAt(m),1);
            }
            m++;
        }
        return 'a';
    }
}