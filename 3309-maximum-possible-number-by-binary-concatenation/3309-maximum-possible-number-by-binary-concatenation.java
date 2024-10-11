class Solution {
    
    
    
    public int maxGoodNumber(int[] nums) {
        int max = 0;
        List<String>al= new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            al.add(Integer.toBinaryString(nums[i]));
        }
        for(int i = 0;i<nums.length;i++){
            HashSet<Integer>hs = new HashSet<>();
            hs.add(i);
            max = Math.max(Integer.parseInt(al.get(i)+check(hs,al), 2),max);
        }
        return max;
    }
    
    public String check(HashSet<Integer>hs,List<String>al){
        if(hs.size() >= al.size()){return "";}
        List<String>as = new ArrayList<>();
        for(int i = 0;i<al.size();i++){
            if(hs.contains(i))continue;
            hs.add(i);
            as.add(al.get(i) + check(hs,al));
            hs.remove(i);
        }
        Collections.sort(as);
        return as.get(as.size()-1);
    }
}