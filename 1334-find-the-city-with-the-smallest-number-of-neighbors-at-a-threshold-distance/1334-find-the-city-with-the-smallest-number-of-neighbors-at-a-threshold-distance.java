class Solution {
    
    class edge{
        int src;
        int des;
        int weight;
        edge(int src, int des, int weight){
            this.src = src;
            this.des = des;
            this.weight = weight;
        }
    }
    
    List<edge>[] arr;
    
    
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        arr = new ArrayList[n];
        for(int i = 0;i<n;i++){
            arr[i] = new ArrayList<>();
        }
        
        for(int i = 0;i<edges.length;i++){
            arr[edges[i][0]].add(new edge(edges[i][0],edges[i][1],edges[i][2]));
            arr[edges[i][1]].add(new edge(edges[i][1],edges[i][0],edges[i][2]));
        }
        
        return check(distanceThreshold);
    }
    
    public int check(int max){
        int m = arr.length;int req = arr.length-1;
        for(int i = 0;i<arr.length;i++){
            HashSet<Integer>hs = new HashSet<>();
            hlpr(i,max,hs, new HashSet<>());
            int s = hs.size()-1;hs.clear();
            if(s<=m){m = s;req = i;}
        }
        
        return req;
    }
    
    
    
    public void hlpr(int src, int w, HashSet<Integer>hs, HashSet<Integer>hm){
        
        if(w < 0 || hs.size() == arr.length){return;}
        
        hs.add(src);hm.add(src);
        for(int i = 0;i<arr[src].size();i++){
            if(!hm.contains(arr[src].get(i).des) && w-arr[src].get(i).weight>=0){
            hlpr(arr[src].get(i).des,w-arr[src].get(i).weight,hs,hm);}
        }
        hm.remove(src);
    }
    
    
}