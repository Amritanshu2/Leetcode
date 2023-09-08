import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]ans = new int[k];
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> pq  = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(Entry<Integer, Integer> entry: hm.entrySet()) {
            pq.add(entry.getValue());
         
        }
        int g = 0;
        while(g<k && pq.size()>0){
            int sa = pq.remove();
            for(Entry<Integer, Integer> entry: hm.entrySet()) {
                if(entry.getValue() == sa){ans[g]= entry.getKey();hm.remove(ans[g]);g++;break;}
         
        }
        }
        return ans;
    }
}