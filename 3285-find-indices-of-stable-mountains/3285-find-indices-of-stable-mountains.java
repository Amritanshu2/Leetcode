class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer>al = new ArrayList<>();
        for(int i = 1;i<height.length;i++){
            if(height[i-1] > threshold){
                al.add(i);
            }
        }
        return al;
    }
}