class Solution {
HashMap<Integer,List<List<Integer>>>hm = new HashMap<>();
public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
for(int i = 0;i<flights.length;i++){
if(!hm.containsKey(flights[i][0])){
List<List<Integer>>al = new ArrayList<>();
List<Integer>as = new ArrayList<>();
as.add(flights[i][1]);as.add(flights[i][2]);
}
else{
List<List<Integer>>al = hm.get(flights[i][0]);
List<Integer>as = new ArrayList<>();
as.add(flights[i][1]);as.add(flights[i][2]);
​
}
}
return far(k,src,dst);
}
public int far(int k, int src, int dst){
if(k<0){
if(src == dst){return 0;}
return -1;
}
if(src == dst){return 0;}
if(!hm.containsKey(src)){return -1;}