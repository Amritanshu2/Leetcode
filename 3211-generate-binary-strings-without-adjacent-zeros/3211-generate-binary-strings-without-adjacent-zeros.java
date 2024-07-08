class Solution {
    
    Set<String>ls = new HashSet<>();
    
    public List<String> validStrings(int n) {
        hlpr("",0,n);
        return new ArrayList<>(ls);
    }
    
    public void hlpr(String s, int pos, int size){
        if(pos == size){
            ls.add(s);return;
        }
        if(pos == 0 || s.charAt(pos-1) == '1'){
            hlpr(s+'1',pos+1,size);
            hlpr(s+'0',pos+1,size);
        }
        else{
            hlpr(s+'1',pos+1,size);
        }
    }
}