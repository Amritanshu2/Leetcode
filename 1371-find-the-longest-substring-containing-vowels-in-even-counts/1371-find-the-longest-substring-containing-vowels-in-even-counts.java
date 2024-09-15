class Solution {
    public int findTheLongestSubstring(String s) {
       HashMap<String, Integer> indexes = new HashMap<>();
    HashMap<Character, Integer> chars = new HashMap<>(){{  
        put('a', 0);put('e', 1);
        put('i', 2);put('o', 3);
        put('u', 4);
    }} ;
    String evenOdd = "00000";
    indexes.put(evenOdd , -1);
    int length = 0;
    for (int i = 0; i < s.length(); ++i) {
 
        char c = s.charAt(i);
        boolean it = chars.containsKey(c);
        if (it != false) {
            if(evenOdd.charAt(chars.get(c)) == '0'){
                evenOdd = evenOdd.substring(0,chars.get(c)) + '1' + evenOdd.substring(chars.get(c)+1);
            }
            else{
                evenOdd = evenOdd.substring(0,chars.get(c)) + '0' + evenOdd.substring(chars.get(c)+1);
            }
        }
        boolean lastIndex = indexes.containsKey(evenOdd);
 
        if (lastIndex == false) {
            indexes.put(evenOdd, i);
        }
        else {
            length = Math.max(length, i - indexes.get(evenOdd));
        }
    }
 
    return length;
    }
}