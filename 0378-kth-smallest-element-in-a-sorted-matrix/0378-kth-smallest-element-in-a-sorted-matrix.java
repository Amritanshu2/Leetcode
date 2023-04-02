class Solution {
    public int kthSmallest(int[][] matrix, int k1) {
        PriorityQueue<Integer> hm = new PriorityQueue<>();
        for(int j = 0;j<matrix.length;j++){
            for(int k = 0;k<matrix[0].length;k++){
                hm.add(matrix[j][k]);
            }
        }
        int i = 1;
        while(i<k1){
            hm.remove();i++;
        }
        return hm.peek();
    }
}