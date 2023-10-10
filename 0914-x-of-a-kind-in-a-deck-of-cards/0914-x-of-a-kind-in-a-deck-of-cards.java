class Solution {
    
    public int gcd(int n ,int h ){
        if(h==0){return n;}
        return gcd(h,n%h);
    }
    
    
    public boolean hasGroupsSizeX(int[] deck) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<deck.length;i++){
            if(hm.containsKey(deck[i])){
                hm.put(deck[i],hm.get(deck[i])+1);
            }
            else{
                hm.put(deck[i],1);
            }
        }
        int n = 0;
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
             n = gcd(n,mapElement.getValue());
        }
        return n >=2 ? true : false ;
    }
}