class Solution {
    public int longestContinuousSubstring(String s) {
        int a = 0;int b = 0;int max = 0;
        HashMap<Character, Integer> alphabetHashMap = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            char letter = (char) (96 + i);
            alphabetHashMap.put(letter, i);
        }
        while(a < s.length() ){
            
            if(a==0 || alphabetHashMap.get(s.charAt(a-1))+1 == alphabetHashMap.get(s.charAt(a))){
                max = Math.max(a-b+1,max);
                a++;
                
            }
           else if(alphabetHashMap.get(s.charAt(a-1))+1 != alphabetHashMap.get(s.charAt(a))){
                b = a;
                max = Math.max(a-b+1,max);
                a++;
            }
        }
        System.out.println(alphabetHashMap);
        return max;
    }
}