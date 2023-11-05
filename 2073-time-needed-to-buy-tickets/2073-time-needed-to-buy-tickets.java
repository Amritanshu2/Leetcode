class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        Queue<Integer> qt = new LinkedList<>();
        for(int i = 0;i<tickets.length;i++){
            hm.put(i,tickets[i]);
            qt.add(i);
        }
        int i = 0;
        while(hm.get(k)>0){
            int m = qt.remove();
            if(m== k && hm.get(k)-1 == 0){return i+1;}
            
            else if(hm.get(m)-1==0){i++;}
            else{hm.put(m,hm.get(m)-1);i++;qt.add(m);}
        }
        return 0;
    }
}