class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length, n = moveTime[0].length;
        
        int[][] moves = {{0,1},{0,-1},{1,0},{-1,0}};
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        
        Integer[][] minTime = new Integer[m][n];
        
        
        pq.offer(new int[]{0,0,0});
        
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            
            if(top[1] == m-1 && top[2] == n-1){
                return top[0];
            }
            
            if(minTime[top[1]][top[2]] != null && minTime[top[1]][top[2]] < top[0]){
                continue;
            }
            
            for(int[] move : moves){
                int x = move[0] + top[1], y = move[1] + top[2];
                
                if(x < 0 || x >= m || y < 0 || y >= n){
                    continue;
                }
                
                int nextMoveCost = Math.max(moveTime[x][y], top[0]) + 1;
                
                if(minTime[x][y] == null || minTime[x][y] > nextMoveCost){
                    minTime[x][y] = nextMoveCost;
                    pq.offer(new int[]{nextMoveCost, x, y});
                }
            }
        }
        
        return -1;
    }

}