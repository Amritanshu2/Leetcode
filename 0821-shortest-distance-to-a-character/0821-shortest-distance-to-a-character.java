class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer>al = new ArrayList<>();int[]ans = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c){al.add(i);}
        }
        for(int i = 0;i<s.length();i++){
            int min = s.length();
            for(int j = 0;j<al.size();j++){
                if(Math.abs(i-al.get(j))<min){min = Math.abs(i-al.get(j));}
                else{break;}
            }
            ans[i] = min;
        }
        return ans;
    }
}