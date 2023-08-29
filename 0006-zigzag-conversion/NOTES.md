class Solution {
public String convert(String s, int numRows) {
HashMap<Integer,String> hm = new HashMap<>();
// int i = 0;int h = 1;int g = 0;
for(int i = 0;i<numRows;i++){
String ss = "";
int j = i;
while(j<s.length()){
int h = 0;
if(i == numRows-1 ){
h = (numRows)*2;
}
else if((numRows-j) == 0){
h = (numRows-1)*2;
}
else
{
h = (Math.abs(numRows-j))*2;
}
char c = s.charAt(j);
ss +=c;
j = j + h - 2;
}
hm.put(i,ss);
}
String jh = "";
for(int i = 0;i<numRows;i++){
jh = jh+ hm.get(i);
}
return jh;
}
}