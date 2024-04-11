class Solution {
public String removeKdigits(String num, int k) {
Stack<Character> st = new Stack<>();
int n = num.length();
for(int i = 0; i < n; i++){
char c = num.charAt(i);
while(st.size() != 0 && st.peek() > c && k > 0){
st.pop();
k--;
}
if(st.size() != 0 || c != '0'){
st.push(c);
}
}
while(st.size() != 0 &&  k > 0){
st.pop();
k--;
}
if(st.size() == 0){
return "0";
}
StringBuilder str = new StringBuilder();
int n2 = st.size();
for(int i = 0; i < n2; i++){
str = str.append(st.pop());
}
return str.reverse().toString();
}
}