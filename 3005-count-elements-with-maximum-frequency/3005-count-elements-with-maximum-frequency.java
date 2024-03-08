class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        // System.out.println(hm);
        ArrayList<Integer>al = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            
            Integer value = entry.getValue();
            al.add(value);
        }
        Collections.sort(al);
        int a = al.get(al.size()-1);
        for(int i = 1;i<al.size();i++){
            if(al.get(al.size()-1) == al.get(al.size()-1-i)){
                a+=al.get(al.size()-1-i);
            }
            else{break;}
        }
        return a;
    }}
