class Solution {
    
    List<List<Integer>> all = new ArrayList<>();
    
    
    public void fun(int[] arr,int tar,ArrayList<Integer>al,int j){
        if(tar < 0){return;}
        if(tar == 0){
            // System.out.println(tar);
            // Collections.sort(al);
            all.add(new ArrayList<>(al));
        }
        for(int i = j;i<arr.length;i++){
            al.add(arr[i]);
            fun(arr, tar-arr[i], al,i);
            al.remove(al.size()-1);
        }
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer>al =  new ArrayList<>();
        fun(candidates,target,al,0);
        // System.out.println(set);
        // List<List<Integer>> all = new ArrayList<>();
        // for (ArrayList element : set) {
        //     all.add(element);
        // }
        return all;
    }
}