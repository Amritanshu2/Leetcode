class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            HashMap<Character,Integer>hm = new HashMap<>();
            boolean t = false;
            for(int j = i;j<s.length();j++){
                hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
                if(hm.get(s.charAt(j)) >= k){t = true;}
                if(t == true){count++;}
            }
        }
        return count;
    }
}