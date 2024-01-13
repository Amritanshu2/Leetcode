class Solution {
    
    ArrayList<String>al = new ArrayList<>();
    
    public void gen(int n,String s,int size,int m){
        if(s.length()== size){al.add(s);return;}
        if(n==0 && m==0){return;}
        if(n>0){
            gen(n-1,s+'(',size,m);
            gen(n-1,s,size,m);
        }
        if(n<m){
            gen(n,s+')',size,m-1);
            
        }
    }
    
    public List<String> generateParenthesis(int n) {
        gen(n,"",2*n,n);
        return al;
    }
}