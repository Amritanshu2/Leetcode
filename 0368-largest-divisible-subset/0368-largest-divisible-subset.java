// class Solution {
    
//     ArrayList<List<Integer>>al = new ArrayList<>();
    
//     public void as(int nums[], ArrayList<Integer>ds, int i){
//         if(i == nums.length){al.add(new ArrayList<>(ds));return;}
//         int aw = 0;
//         for(int j = 0;j<ds.size();j++){
//             if(nums[i]%ds.get(j) != 0){aw++;break;}
//         }     
//         if(aw == 0){
//             ds.add(nums[i]);
//             as(nums,ds,i+1);
//             ds.remove(ds.size()-1);
//             as(nums,ds,i+1);
//         }
//         else{
//             as(nums,ds,i+1);
//         }
//     }
    
//     public List<Integer> largestDivisibleSubset(int[] nums) {
//         Arrays.sort(nums);
//         as(nums, new ArrayList<Integer>(),0);
//         int max = 0;int asdf = 0;
       
//         for(int i = 0;i<al.size();i++){
//             if(al.get(i).size() > max){max = al.get(i).size();asdf = i;}
//         }
//         return al.get(asdf);
//     }
// }


class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        int n = nums.length;

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxSize = 1, maxIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;

                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int currentSize = maxSize;
        int currentVal = nums[maxIndex];

        for (int i = maxIndex; i >= 0; i--) {
            if (currentSize > 0 && currentVal % nums[i] == 0 && dp[i] == currentSize) {
                result.add(nums[i]);
                currentVal = nums[i];
                currentSize--;
            }
        }

        return result;
    }
}
