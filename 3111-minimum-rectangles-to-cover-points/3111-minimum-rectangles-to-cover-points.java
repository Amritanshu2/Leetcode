class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        HashSet<Integer>hs = new HashSet<>();
        
        for(int i = 0;i<points.length;i++){
            hs.add(points[i][0]);
        }
        List<Integer>al = new ArrayList<>(hs);
        Collections.sort(al);
        
        int i = 0;
        while(al.size()!=0){
            i++;
            int a = al.get(0);
            al.remove(0);
            for(int j = a;j<=a+w && al.size()>0;j++ ){
                if(al.get(0) == j){
                    al.remove(0);
                }
            }
        }
        return i;
    }
}