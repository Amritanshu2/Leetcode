class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[]arr = new int[queries.length];
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.fill(arr,-1);
        for(int i = 0;i<arr.length;i++){
            
            pq.add( Math.abs(queries[i][0]) + Math.abs(queries[i][1]));
            if(pq.size()>k){pq.remove();}
            if(i>=k-1){arr[i] = pq.peek();}
        }
        return arr;
    }
}