class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];int num = events[0][0];
        for(int i = 1;i<events.length;i++){
            if(events[i][1]-events[i-1][1] > max){max = events[i][1]-events[i-1][1];num = events[i][0];}
            else if(events[i][1]-events[i-1][1] == max){num = Math.min(num,events[i][0]);}
        }
        return num;
    }
}