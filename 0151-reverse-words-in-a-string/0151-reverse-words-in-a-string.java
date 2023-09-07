class Solution {
    public String reverseWords(String s) {
        ArrayList<String>st = new ArrayList<>();
        int i = 0;
        while(i<s.length()){
            String h = "";
            while(i<s.length() && s.charAt(i) != ' ' ){
                h = h+s.charAt(i);i++;
            }
            if(i<s.length() && s.charAt(i)==' '){i++;}
            if(h.length()>0)st.add(h);
        }
        String m ="";
        if(st.size()>0)
        m = st.get(st.size()-1);
        for(int iw = st.size()-2;iw>=0;iw--){
            m = m + " " + st.get(iw);
        }
        return m;
    }
}