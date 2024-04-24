class Solution {
    
    public class edge{
        int src;
        int des;
        
        edge(int src, int des){
            this.src = src;
            this.des = des;
        }
    }
    boolean a = true;
    
    public boolean isBipartite(int[][] graph) {
        List<edge>[]arr = new ArrayList[graph.length];
        for(int i = 0;i<graph.length;i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0;i<graph.length;i++){
            List<edge>al = arr[i];
            for(int j = 0;j<graph[i].length;j++){
                al.add(new edge(i,graph[i][j]));
            }
            arr[i] = al;
        }
        for(int i = 0;i<graph.length;i++){
            if(!visit.contains(i)){
                chk(arr,i,0,new HashSet<>(),new HashSet<>());
            }
        }
        return a;
        
    }
    HashSet<Integer>visit = new HashSet<>();
    
    public void chk(List<edge>[]arr,int i,int pos,HashSet<Integer>h1,HashSet<Integer>h2){
        
        if(pos == 0){
            h1.add(i);pos = 1;
        }
        if(visit.contains(i)){return;}
        visit.add(i);
        for(int j = 0;j<arr[i].size();j++){
            if(pos == 1){
                if(h1.contains(arr[i].get(j).des)){a = false;return;}
                else{h2.add(arr[i].get(j).des);}
                chk(arr,arr[i].get(j).des,2,h1,h2);
            }
            else{
                if(h2.contains(arr[i].get(j).des)){a = false;return;}
                else{h1.add(arr[i].get(j).des);}
                chk(arr,arr[i].get(j).des,1,h1,h2);
            }
        }
        
    }
}