class Solution {
    public int findindex(ArrayList<Integer>a1,int val){
        int low=0;
        int high=a1.size()-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a1.get(mid)<val){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
      return low;  
    }
    public long numberOfSubarrays(int[] nums) {
        int n=nums.length;

       int[]largest=new int[n];
        Stack<Integer>s1=new Stack<>();
         s1.push(-1);
        for(int i=0;i<n;i++){

            while(s1.peek()!=-1&&nums[i]>=nums[s1.peek()]){
                s1.pop();
            }
            largest[i]=s1.peek();
            s1.push(i);
        }

        long ans=0;
        
        HashMap<Integer,ArrayList<Integer>>mp= new HashMap<>();

        for(int i=0;i<n;i++){
             int el=nums[i];
             int largerelementid=largest[i];
             ArrayList<Integer>a1=mp.getOrDefault(el,new ArrayList<>());

             int count=0;
             if(a1.size()>0){
               
               count=a1.size()-findindex(a1,largerelementid);
             }
             ans+=count+1;
             a1.add(i);
             mp.put(el,a1);
        }
     return ans;   
    }
}