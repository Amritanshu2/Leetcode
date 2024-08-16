class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int a = (int)1e8;int idx = 0;
        int b = -(int)1e8;int idx2 = 0;
        
        for(int i = 0;i<arrays.size();i++){
            if(a>arrays.get(i).get(0)){idx = i;}
            a = Math.min(a,arrays.get(i).get(0));
            
        }
        
        for(int i = 0;i<arrays.size();i++){
            
            if(b<arrays.get(i).get((arrays.get(i)).size()-1)){idx2 = i;}
            b = Math.max(b,arrays.get(i).get((arrays.get(i)).size()-1));
        }
        
        if(idx == idx2){
            int dis = b - min(arrays,idx);
            dis = Math.max(dis,max(arrays,idx)-a);
            return dis;
            
        }
        return b-a;
    }
    
    public int min(List<List<Integer>> arrays , int idx){
        int a = (int)1e8;int idx2 = 0;
        
        for(int i = 0;i<arrays.size();i++){
            if(i == idx){continue;}
            a = Math.min(a,arrays.get(i).get(0));
            
        }
        return a;
    }
    
    public int max(List<List<Integer>> arrays , int idx){
        int b = -(int)1e8;
        
        for(int i = 0;i<arrays.size();i++){
            
             if(i == idx){continue;}
            b = Math.max(b,arrays.get(i).get((arrays.get(i)).size()-1));
        }
        return b;
    }
}