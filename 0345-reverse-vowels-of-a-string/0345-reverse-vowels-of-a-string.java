class Solution {
    HashSet<Integer>hs = new HashSet<>();
    
    
    public String reverseVowels(String s) {
        List<Character>al = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'i'||s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'o'|| s.charAt(i) == 'u' || s.charAt(i) == 'A' ||s.charAt(i) == 'E' || s.charAt(i) == 'I' ||s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                hs.add(i);
                al.add(s.charAt(i));
            }
        }
        String S = "";int sa = al.size()-1;
        for(int i = 0;i<s.length();i++){
            if(hs.contains(i)){
                S += al.get(sa);sa--;continue;
            }
            S+= s.charAt(i);
        }
        return S;
    }
}