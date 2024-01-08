class Solution {
    
    HashSet<List<Integer>>hs = new HashSet<>();
    
    // public void sum(int i,ArrayList<Integer>al,int[]nums,int s){ 
//         if(al.size()==3 && s==0){
//             hs.add(new ArrayList<>(al));return;
//         }
//         if((i>=nums.length) || (al.size()==3) || (s>0 && nums[i]>0) ){return;}
//         al.add(nums[i]);
//         sum(i+1,al,nums,s+nums[i]);
//         al.remove(al.size()-1);
//         sum(i+1,al,nums,s);
//     }
    

    public List<List<Integer>> threeSum(int[] arr) {
//         Arrays.sort(nums);
        
//         sum(0,new ArrayList<>(),nums,0);
       
//         List<List<Integer>>al  = new ArrayList<>(hs);
//         return al;
        

    if (arr == null || arr.length < 3) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {

          // Add the set, and move to find other triplets
          result.add(Arrays.asList(arr[i], arr[left], arr[right]));
          left++;
          right--;
        } else if (sum < 0)
          left++;
        else
          right--;
      }
    }
    return new ArrayList<>(result);
    }
    
    
}



