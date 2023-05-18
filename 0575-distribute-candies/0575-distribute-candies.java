class Solution {
    public int distributeCandies(int[] c) {
        int num=1;
        Arrays.sort(c);
        for(int i=1;i<c.length;i++){
            if(c[i]!=c[i-1]){
                num++;
            }
        }
        if(num<=c.length/2){
            return num;
        }
        return c.length/2;
        
    }
}