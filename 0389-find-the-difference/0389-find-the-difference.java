class Solution {
    public char findTheDifference(String s, String t) {
      HashMap<Character,Integer> hm =new HashMap<>();
      for(int i= 0;i<s.length();i++){
          if(hm.containsKey(s.charAt(i))){
              hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
          }
          else{hm.put(s.charAt(i),1);}
      }  
      for(int i = 0;i<t.length();i++){
          if(hm.containsKey(t.charAt(i))!=true || hm.get(t.charAt(i)) ==0){return t.charAt(i);}
          else{hm.put(t.charAt(i),hm.get(t.charAt(i))-1);}
      }  
        return 'a';
      
        
    }
    
}