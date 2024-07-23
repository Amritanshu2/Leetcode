class Solution {
    public int minimumLength(String s) {
        HashMap<Character,List<Integer>>hm = new HashMap<>();
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                List<Integer>al = new ArrayList<>();al.add(i);
                hm.put(s.charAt(i),al);
            }
            else{
                List<Integer>al = hm.get(s.charAt(i));
                al.add(i);
                if(al.size() == 3){
                    hs.add(al.get(0));hs.add(al.get(2));
                    al.remove(0);al.remove(1);
                    
                }
            }
        }
        
        String a  = "";
        for(int i = 0;i<s.length();i++){
            if(!hs.contains(i)){
                a += s.charAt(i);
            }
        }
        return a.length();
    }
}