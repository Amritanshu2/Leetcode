<----------------------------1st approach--------------------->
​
class Solution {
public static class graph{
int src;
int des;
int wt;
graph(int src,int des,int wt){
this.src = src;
this.des = des;
this.wt = wt;
}
}
int min = (int)1e8;
public int minScore(int n, int[][] roads) {
ArrayList<graph>arr[] = new ArrayList[n+1];
for(int i = 0;i<=n;i++){
arr[i] = new ArrayList<>();
}
for(int i = 0;i<roads.length;i++){
arr[roads[i][0]].add(new graph(roads[i][0],roads[i][1],roads[i][2]));
arr[roads[i][1]].add(new graph(roads[i][1],roads[i][0],roads[i][2]));
}
List<Integer>al = new ArrayList<>();
trav(n,arr,1,al);
return min;
}
public void trav(int n,List<graph>arr[],int j , List<Integer>al){
if(j == n){
List<Integer>as = new ArrayList<>(al);
Collections.sort(as);
min = Math.min(min,as.get(0));
return;
}
while(arr[j].size()>0){
al.add(arr[j].get(0).wt);
int dest = arr[j].get(0).des;
arr[j].remove(0);
trav(n,arr,dest,al);
al.remove(al.size()-1);