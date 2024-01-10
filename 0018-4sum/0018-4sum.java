class Solution {
    HashSet<List<Integer>>result = new HashSet<>();
    public void threeSum(int[] arr,int tar, int i1) {

    if (arr == null || arr.length < 3|| arr[0]>0 && tar<0) return ;

    
    // Set<List<Integer>> result = new HashSet<>();

    
    for (int i = 0; i < arr.length - 2; i++)
    {
      
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == tar) {

          // Add the set, and move to find other triplets
          result.add(Arrays.asList(i1,arr[i], arr[left], arr[right]));
          left++;
          right--;
        } else if (sum < tar)
          left++;
        else
          right--;
      }
    }
    
    }
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-3;i++){
            int[] subarray = Arrays.copyOfRange(nums, i+1, nums.length);
            System.out.println(subarray[0]);
            threeSum(subarray,target-nums[i],nums[i]);
        }
        return new ArrayList<>(result);
    }
}