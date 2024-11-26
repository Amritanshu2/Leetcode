class Solution {
    
    public class graph{
        int src;
        int des;
        graph(int src, int des){
            this.src = src;
            this.des = des;}
    }
    
    public int findChampion(int n, int[][] edges) {
        List<graph>arr[] = new ArrayList[n];
        for(int i = 0;i<n;i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0;i<edges.length;i++){
            List<graph>al = arr[edges[i][1]];
            al.add(new graph(edges[i][1],edges[i][0]));
        }
        int ans = 0;int num = 0;
        for(int i = 0;i<n;i++){
            if(arr[i].size() == 0){ans = i;num++;}
            if(num > 1){return -1;}
        }
        return ans;
    }
}