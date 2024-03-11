class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer>hs = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        String ans = "";
        for(int i = 0;i<order.length();i++){
            if(hs.containsKey(order.charAt(i))){
                while(hs.containsKey(order.charAt(i))){
                    ans += order.charAt(i);
                if(hs.get(order.charAt(i))-1 != 0){hs.put(order.charAt(i),hs.get(order.charAt(i))-1);}
                else{hs.remove(order.charAt(i));}
                }
            }
            
            
        }
        for(int i = 0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                ans += s.charAt(i);
                if(hs.get(s.charAt(i))-1 != 0){
                    hs.put(s.charAt(i),hs.get(s.charAt(i))-1);
                }
                else{hs.remove(s.charAt(i));}
                                           
            }
        }
        return ans;
    }
}