class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>> ar = new ArrayList();
        
        int diff = arr[1]-arr[0];
        
        // ar.add(cr); 
        for(int i = 0;i<arr.length-1;i++){
            ArrayList<Integer> cr = new ArrayList<>();
            
            
            if((arr[i+1]-arr[i])==diff){
                cr.clear();
                cr.add(arr[i]);
                cr.add(arr[i+1]);
                ar.add(cr);
                
                
            }
            
            else if((arr[i+1]-arr[i])<diff){
                ar.clear();
                diff = arr[i+1]-arr[i];
                cr.clear();
                cr.add(arr[i]);
                cr.add(arr[i+1]);
                ar.add(cr);

            }
            
        }
        return ar;
        
    }
}