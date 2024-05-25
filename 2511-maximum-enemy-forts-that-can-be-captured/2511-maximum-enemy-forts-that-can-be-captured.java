class Solution {
    public int captureForts(int[] forts) {
        int enemy = -1;int pos = -1;int max = 0;
        for(int i = 0;i<forts.length;i++){
            if(forts[i] == -1){
                enemy = i;
                if(pos != -1){max = Math.max(max,Math.abs(enemy-pos)-1);pos = -1;}
            }
            if(forts[i] == 1){
                pos = i;
                if(enemy!=-1){max = Math.max(max,Math.abs(enemy-pos)-1);enemy = -1;}
            }
            
            
        }return max;
        
    }
}