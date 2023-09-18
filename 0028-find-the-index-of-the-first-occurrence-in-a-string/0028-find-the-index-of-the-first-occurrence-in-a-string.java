class Solution {
    public int strStr(String h, String n) {
        if(h.length()==n.length()){
            for(int i = 0;i<h.length();i++){
                if(h.charAt(i)!=n.charAt(i)){return -1;}
            }
            return 0;
        }
        
        for(int i = 0;i<h.length()-n.length()+1;i++){
            String f = h.substring(i,i+n.length());
            System.out.println(f);
            int fgh = 0;
            for(int hg = 0;hg<n.length();hg++){
                if(f.charAt(hg)!=n.charAt(hg))fgh++;
            }
            if(fgh == 0){return i;}
        }
        return -1;
    }
}