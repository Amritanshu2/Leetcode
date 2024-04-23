class Solution {
public class edge{
int curr;
int des;
// int pos;
edge(int curr, int des){
this.curr = curr;
this.des = des;
// this.pos = pos;
}
}
public List<Integer> findMinHeightTrees(int n, int[][] edges) {
HashMap<Integer,ArrayList<edge>> hm = new HashMap<>();
for(int i = 0;i<n;i++){
hm.put(i,new ArrayList<>());
}
for(int i = 0;i<edges.length;i++){
ArrayList<edge>al = hm.get(edges[i][0]);
al.add(new edge(edges[i][0],edges[i][1]));
hm.put(edges[i][0],al);
ArrayList<edge>all = hm.get(edges[i][1]);
al.add(new edge(edges[i][1],edges[i][0]));