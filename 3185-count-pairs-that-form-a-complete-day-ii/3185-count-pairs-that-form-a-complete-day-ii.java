class Solution {
    public long countCompleteDayPairs(int[] hours) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<hours.length; i++){
            hm.put(hours[i]%24, hm.getOrDefault(hours[i]%24,0)+1);
        }
        long a = 0;
        for(int i = 0; i<hours.length; i++){
            if(hm.containsKey((24-hours[i]%24)%24)){
            hm.put(hours[i]%24,hm.get(hours[i]%24)-1);if(hm.get(hours[i]%24) == 0){hm.remove(hours[i]%24);}
            if(hm.containsKey((24-hours[i]%24)%24)){
                a += hm.get((24-hours[i]%24)%24);
            }
            }
        }
        return a;
    }
}