class Solution {
    
    String ss = "";
    
    public int maxLength(List<String> arr) {
        max("",0,arr);
        return ss.length();
    }
    
    public void max(String s,int i,List<String>arr){
        if(i == arr.size()){
            HashSet<Character>hs = new HashSet<>();
            for(int j = 0;j<s.length();j++){if(hs.contains(s.charAt(j))){return;}
                                           hs.add(s.charAt(j));}
            if(s.length()>ss.length()){ss = s;}return;
        }
        max(s+arr.get(i),i+1,arr);
        max(s,i+1,arr);
    }
}