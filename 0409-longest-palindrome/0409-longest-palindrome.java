class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){hm.put(s.charAt(i),hm.get(s.charAt(i))+1);}
            else{
                hm.put(s.charAt(i),1);
            }
        }
        int m = 0;int odd = 0;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            Character key = entry.getKey();
            if(hm.get(key)%2 ==0){m += hm.get(key);}
            else if(hm.get(key)%2 !=0 && odd == 0){m += hm.get(key);odd++;}
            else{m += hm.get(key)-1;}
        }
        return m;
    }
}