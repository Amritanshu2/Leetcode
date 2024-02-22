class Solution {
public int numDistinct(String s,String t) {
return total(s,t,0,"");
}
public int total(String s,String t,int i, String as ){
if(i == s.length()){
if(as.equals(t)){
return 1;
}
return 0;}
int tot = total(s,t,i+1,as+s.charAt(i))+total(s,t,i+1,as);
return tot;
}}