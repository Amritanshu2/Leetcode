class Solution {
    
    HashMap<Integer,Integer>hm1 = new HashMap<>();
    
    public int check(int a ){
        if(a==0){return 0;}
        if(a<0){return 1000000;}
        if(hm1.containsKey(a)){return hm1.get(a);}
        int m = check(a-3)+1;
        int b = check(a-2)+1;
        hm1.put(a,Math.min(m,b));
        return Math.min(m,b);
    }
    
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0;i<tasks.length;i++){
            hm.put(tasks[i],hm.getOrDefault(tasks[i],0)+1);
        }
        int count = 0;
        for (Integer key : hm.keySet()) {
            int value = hm.get(key);
            if(value == 1){return -1;}
            count+= check(value);
            
        }
        return count;
    }
}