class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> al = new ArrayList<>();
        Stack<String>st = new Stack<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        st.push(words[0]);
        for(int i = 0;i<words[0].length();i++){
            if(hm.containsKey(words[0].charAt(i))){hm.put(words[0].charAt(i),hm.get(words[0].charAt(i)+1));}
            else{hm.put(words[0].charAt(i),1);}
        }
        for(int j = 0;j<words.length;j++){
            HashMap<Character,Integer> hm1 = new HashMap<>();
            for(int i = 0;i<words[j].length();i++){
                if(hm1.containsKey(words[j].charAt(i))){                                                hm1.put(words[j].charAt(i),hm1.get(words[j].charAt(i)+1));
                }
                else{hm1.put(words[j].charAt(i),1);}
        }
            if(hm.equals(hm1)!=true ){
                hm = hm1;
                al.add(st.pop());
                st.push(words[j]);
            }
        }
        al.add(st.pop());
        return al;
    }
}