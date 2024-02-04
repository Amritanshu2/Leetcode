class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int i = -1;
        int j = -1;
        int mct = 0;
        int dmct = t.length();
        String ans = "";
        HashMap<Character,Integer> map1 = new HashMap<>();
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i<s.length()-1&&mct<dmct){
                i++;
                char ch = s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
                    mct++;
                }
                f1 = true;
            }
            while(mct==dmct&&j<i){
                String pass = s.substring(j+1,i+1);
                if(ans.length()==0||pass.length()<ans.length()){
                    ans = pass;
                }
                j++;
                char ch = s.charAt(j);
                if(map1.getOrDefault(ch,0)==1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
                if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                    mct--;
                }
                f2 = true;
            }
            if(f1==false&&f2==false){
                break;
            }
        }
        return ans;
    }
}