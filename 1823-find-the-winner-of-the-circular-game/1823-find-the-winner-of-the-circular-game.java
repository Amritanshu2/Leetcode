class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i = 1;i<=n;i++){
            que.add(i);
        }
        while(que.size() != 1){
            for(int i = 0;i<k-1;i++){
                int a = que.remove();
                que.add(a);
            }
            que.remove();
        }
        return que.remove();
    }
}