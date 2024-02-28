class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>hm = new HashMap<>();
        int asd = 97;
        for(int i = 0;i<key.length();i++){
            if(key.charAt(i)!=' '){
            if(!hm.containsKey(key.charAt(i))){
                hm.put(key.charAt(i),(char)(asd));asd++;
            }
            }
        }
        String ans = "";
        for(int i = 0;i<message.length();i++){
            if(message.charAt(i)==' '){ans+=" ";continue;}
            ans += hm.get(message.charAt(i));
            
        }
        return ans;
    }
}