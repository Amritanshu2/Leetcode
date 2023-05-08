class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ar = new ArrayList();
        ArrayList<Integer> cr = new ArrayList<>();
        int diff = arr[1]-arr[0];
        cr.add(arr[0]);
        cr.add(arr[1]);
        ar.add(cr);
        for(int i = 1;i<arr.length-1;i++){
            
            
            if((arr[i+1]-arr[i])==diff){
                ar.add(Arrays.asList(arr[i], arr[i + 1]));
            }
            
            else if((arr[i+1]-arr[i])<diff){
                ar.clear();diff = arr[i+1]-arr[i];
                ar.add(Arrays.asList(arr[i], arr[i + 1]));

            }
            
        }
        return ar;
        
    }
}