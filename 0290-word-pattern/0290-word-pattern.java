class Solution {
    public boolean wordPattern(String p, String s) {
        String[] ss = s.split(" ");
        
        // for(int i = 0;i<ss.length;i++){System.out.println(ss[i]);}
        HashMap<Character,String> hm = new HashMap<>();int h = 0;
        for(int i = 0;i<p.length() && i<ss.length;i++){
            if(hm.containsKey(p.charAt(i))){
                if(!ss[i].equals(hm.get(p.charAt(i)))){return false;}
            }
            else{
                if(hm.containsValue(ss[i])){return false;}
                else{
                    hm.put(p.charAt(i),ss[i]);
                }
                
            }
            h++;
        }
        if(h == p.length() && h == ss.length){return true;}
        return false;
        
    }
}