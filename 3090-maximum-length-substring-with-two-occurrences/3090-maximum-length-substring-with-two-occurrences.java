class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        int st = 0;int f = 0;int max = 0;int check = 0;
        while(f<s.length()){
            char ch = s.charAt(f);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            while(hm.get(ch)>2){
                hm.put(s.charAt(st),hm.get(s.charAt(st))-1);st++;
            }
            max = Math.max(max,f-st+1);
            f++;
            
        }
        return max;
    }
}