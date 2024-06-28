class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[]arr = new long[n];
        Arrays.fill(arr,0);
        for(int i = 0;i<roads.length;i++){
            arr[roads[i][0]] = arr[roads[i][0]]+1;
            arr[roads[i][1]] = arr[roads[i][1]]+1;
        }
        Arrays.sort(arr);long sum = 0;
        for(int i = arr.length-1;i>=0;i--){
            sum += arr[i]*n--;
        }
        return sum;
    }
}