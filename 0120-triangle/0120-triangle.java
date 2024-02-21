class Solution {
    int arr[][];
    public int minimumTotal(List<List<Integer>> tri) {
        int sum = 0;
        arr = new int[tri.size()][tri.get(tri.size()-1).size()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -99999;
            }
        }
        sum = min(tri,0,0);
        return sum;
    }
    
    public int min(List<List<Integer>> tri, int i, int lvl){
        if(lvl == tri.size()-1){return tri.get(lvl).get(i);}
        if(arr[i][lvl]!= -99999){return arr[i][lvl];}
        int a = min(tri, i,lvl+1)+tri.get(lvl).get(i);
        int b = min(tri, i+1,lvl+1)+tri.get(lvl).get(i);
        return arr[i][lvl] = Math.min(a,b);
    }
}