class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        int sum = 0;
        for(int i = 0;i<s.length();i++){
           sum += Math.abs( i-hm.get(t.charAt(i)));
        }
        return sum;
    }
}