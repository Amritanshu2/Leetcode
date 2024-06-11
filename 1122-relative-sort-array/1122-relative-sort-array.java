import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] a, int[] ar) {
        Hashtable<Integer,Integer> hm = new Hashtable<>();int h = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        for(int i = 0;i<ar.length;i++){
            for(int j = 0;j<hm.get(ar[i]);j++){
                a[h] = ar[i];h++;
            }
            hm.remove(ar[i]);
        }
        
        Set<Integer> setOfKeys = hm.keySet();
       for (Integer key : setOfKeys) {
 
          
            for(int i = 0;i<hm.get(key);i++){
                pq.add(key);
            }
 
        }
        while(pq.peek()!=null){
            a[h] = pq.remove();h++;
            
        }
        return a;
        
    }
}