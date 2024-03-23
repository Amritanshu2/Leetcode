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
    
    boolean[]visited;
    
    public int minScore(int n, int[][] roads) {
        
       ArrayList<graph>arr[] = new ArrayList[n+1];
        for(int i = 0;i<=n;i++){
            arr[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];
        
        for(int i = 0;i<roads.length;i++){
            arr[roads[i][0]].add(new graph(roads[i][0],roads[i][1],roads[i][2]));
            arr[roads[i][1]].add(new graph(roads[i][1],roads[i][0],roads[i][2]));
        }
        List<Integer>al = new ArrayList<>();
        trav(n,arr,1,al);
        return min;
    }
    
    int min = (int)1e8;
    
    public void trav(int n,List<graph>arr[],int j , List<Integer>al){
        
        if(visited[j] == true){return;}
        
        for(int i = 0;i<arr[j].size();i++){
            
            
            visited[arr[j].get(i).src] = true;
           
            min = Math.min(min,arr[j].get(i).wt);
            trav(n,arr,arr[j].get(i).des,al); 
            
        }
        
    }
}