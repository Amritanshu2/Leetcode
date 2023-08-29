class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){return s;}
        HashMap<Integer,String> hm = new HashMap<>();
        boolean f = false;int h = 0;
        for(int i = 0;i<numRows;i++){
            hm.put(i,"");
        }
        for(int i = 0;i<s.length();i++){
            if(h == 0)f = true;
            else if(h == numRows-1)f = false;
            hm.put(h,hm.get(h)+s.charAt(i));
            if(f == true){h++;}
            else{h--;}
        }
        String ss = "";
        for(int i = 0;i<numRows;i++){
            ss = ss + hm.get(i);
        }
        return ss;
    }
}