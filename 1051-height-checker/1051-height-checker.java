class Solution {
    public int heightChecker(int[] h) {
        int[] c = Arrays.copyOf(h, h.length);
        Arrays.sort(c);
        int m= 0;
        for(int i = 0;i<h.length;i++){
            if(h[i]!=c[i]){m++;}
        }
        return m;
    }
}