class Solution {
public String reverseStr(String s, int k) {
int n = 0;String ans = "";
while(n<s.length()){
String sd = "";
for(int i = n;i<n+k && i<s.length();i++){
sd = s.charAt(i) + sd ;
}
n = n+k;int ghj = 0;
ans = ans + sd;
}
return ans;
}
}