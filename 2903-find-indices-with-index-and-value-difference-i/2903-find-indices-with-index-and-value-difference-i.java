class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
         int n = nums.length;
    int[] answer = {-1, -1};

    for(int i = 0; i<n; i++){
        for(int i1 = i+indexDifference; i1< n; i1++){
            if(Math.abs(nums[i]-nums[i1])>=valueDifference){
                answer[0]= i;
                answer[1] = i1;
                return answer;
            }
        }
    }

    return answer;
    }
}
