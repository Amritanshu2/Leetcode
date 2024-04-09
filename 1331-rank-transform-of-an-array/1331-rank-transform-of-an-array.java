class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ca = Arrays.copyOf(arr, arr.length);
        Arrays.sort(ca);
        HashMap<Integer,Integer>hm = new HashMap<>();int h = 1;
        for(int i = 0;i<ca.length;i++){
            if(!hm.containsKey(ca[i])){
                hm.put(ca[i],h);h++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}