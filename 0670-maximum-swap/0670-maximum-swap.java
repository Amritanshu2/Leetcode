class Solution {
    
    public class com implements Comparable<com>{
        int num;int pos;
        com(int num,int pos){this.num = num;this.pos = pos;}
        
        @Override
        public int compareTo(com other) {
            int numComparison = Integer.compare(this.num, other.num);
            return (numComparison != 0) ? numComparison : Integer.compare(this.pos, other.pos);
        }
    }
    
    public int maximumSwap(int num) {
        String g = ""+num;
        int[]arr = new int[g.length()];
        int i = g.length()-1;
        PriorityQueue<com>pq = new PriorityQueue<>(Collections.reverseOrder());
        while(num>0){arr[i]= (num%10);pq.add(new com(num%10,i));num/=10;i--;}
        i = 0;
        int prev = 0;int pos = 0;
        while(pq.size()>0 && i>=0){
            if(arr[i] != pq.peek().num){
                if(pq.peek().num == prev){
                    int a = pq.peek().num;
                    arr[pos] = arr[i];
                    arr[i] = pq.peek().num;break;
                }
                else{
                    int a = pq.peek().num;
                    arr[pq.peek().pos] = arr[i];
                    arr[i] = pq.peek().num;break;
                }
            }
            if(prev != pq.peek().num){prev = pq.peek().num;pos = pq.peek().pos;}
            i++;
            pq.poll();
        }
        num = 0;
        for (int j : arr) {
            num = num * 10 + j;
        }
        return num;
    }
}