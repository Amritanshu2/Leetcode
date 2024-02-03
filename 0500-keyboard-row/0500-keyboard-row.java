class Solution {
    public HashMap<Integer,String>hm = new HashMap<>();
    
    
    public boolean find(String a , String b){
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
    
    public String[] findWords(String[] words) {
        hm.put(1,"QWERTYUIOPqwertyuiop");
        hm.put(2,"ASDFGHJKLasdfghjkl");
        hm.put(3,"ZXCVBNMzxcvbnm");
        List<String>al = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            for (Integer key : hm.keySet()) {
                if(hm.get(key).indexOf(words[i].charAt(0))!=-1){
                    if(find(words[i],hm.get(key))){al.add(words[i]);}
                    break;
                }
            
            }
        }
        System.out.println(al);
        String[] array = al.toArray(new String[0]);
        return array;
    }
}