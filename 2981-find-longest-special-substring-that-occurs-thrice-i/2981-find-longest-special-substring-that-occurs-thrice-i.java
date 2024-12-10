
class Solution {
    public int maximumLength(String s) {
        if (s.isEmpty()) return -1;

        int n = s.length();
        

        HashMap<String, Integer> map = new HashMap<>();
        int len = 0;

        for (int i = 1; i <= s.length()-1; i++) {
            for (int j = 0; j <= n - i; j++) {
                if(j+i > s.length())break;
                String substring = s.substring(j, j + i);
                if(isspecial(substring))continue;
                map.put(substring, map.getOrDefault(substring, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 3 && entry.getKey().length() > len) {
                len = entry.getKey().length();
            }
        }

        return len == 0 ? -1 : len;
    }
    
    public boolean isspecial(String s){
        char a = s.charAt(0);
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) != a){return true;}
        }
        return false;
    }
}
