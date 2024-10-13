class Solution {
    
    public class hm implements Comparable<hm>{
        int num;
        int src;
        hm(int num, int src){
            this.num = num;this.src = src;
        }
        
        @Override
        public int compareTo(hm other) {
        return this.num - other.num; 
    }
        
    }
    
    public int[] smallestRange(List<List<Integer>> nums) {
        List<hm>al = new ArrayList<>();
        for(int i = 0;i<nums.size();i++){
            for(int j = 0;j<nums.get(i).size();j++){
                al.add( new hm(nums.get(i).get(j),i));
            }
        }
        Collections.sort(al);
        
        return findMin(al,nums.size());
    }
    
    public int[] findMin(List<hm>nums , int max){
        int i = 0;int j = 0;int min = (int)1e8;;int l = (int)1e8;int r = -(int)1e8;
        HashMap<Integer,List<Integer>>hm1 = new HashMap<>();
        
        while(j<nums.size()){
            if(!hm1.containsKey(nums.get(j).src)){
                hm1.put(nums.get(j).src,new ArrayList<>());
            }
            (hm1.get(nums.get(j).src)).add(nums.get(j).num);
            while(hm1.size() == max){
                if(min> nums.get(j).num- nums.get(i).num){l = i;r = j;min = nums.get(j).num- nums.get(i).num;}
                hm1.get(nums.get(i).src).remove(0);
                if(hm1.get(nums.get(i).src).size() == 0){hm1.remove(nums.get(i).src);}
                i++;
            }
            j++;
        }
        int ans[] = new int[2];
        ans[0] = nums.get(l).num;
        ans[1] = nums.get(r).num;
        return ans;
        
    }
}