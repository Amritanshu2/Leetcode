import java.util.Comparator;
class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            Integer temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        List<Integer> al = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i =  0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            al.add(entry.getValue());
            l.add(entry.getKey());
        }
        int g = 0;
        Collections.sort(al);
        Collections.sort(l , Collections.reverseOrder());
        while(l.size()!=0){
            for(int i = 0;i<l.size();i++){
                if(hm.get(l.get(i))==al.get(0)){
                    for(int h = 0;h<al.get(0);h++){
                        nums[g] = l.get(i);
                        g++;
                    }
                    l.remove(i);al.remove(0);break;
                }
            }
        }
        return nums;
        
    }
}