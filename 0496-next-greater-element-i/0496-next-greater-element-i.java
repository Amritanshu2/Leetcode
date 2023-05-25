class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];Arrays.fill(arr,-2);
        Stack<Integer>st = new Stack<>();
        for(int i =0; i<n;i++){
            
                    if(st.empty()){
                    arr[n-i-1] = -1;
                    st.push(nums[n-1-i]);
                    }
                    else if(st.peek()>nums[n-1-i]){
                    arr[n-i-1] = st.peek();
                    st.push(nums[n-1-i]);

                    }
                    else{
                        while(arr[n-i-1]==-2){
                            st.pop();
                            
                    if(st.empty()){
                    arr[n-i-1] = -1;
                    st.push(nums[n-1-i]);
                    }
                    else if(st.peek()>nums[n-1-i]){
                    arr[n-i-1] = st.peek();
                    st.push(nums[n-1-i]);

                    }
                        }
                    }
                
             }   
        
        for(int i = 0;i<nums1.length;i++){
            for(int i1 = 0;i1<nums.length;i1++){
                if(nums1[i] == nums[i1]){
                    nums1[i] = arr[i1];break;
                }
            }
        }
        return nums1;
    }
}