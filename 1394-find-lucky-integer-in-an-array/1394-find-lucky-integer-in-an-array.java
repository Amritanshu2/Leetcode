class Solution {
    public int findLucky(int[] arr) {
        int n =0;
        HashMap <Integer,Integer> hp = new HashMap<>();PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<arr.length;i++){
            if(hp.containsKey(arr[i])){
                hp.put(arr[i],hp.get(arr[i])+1);
            }
            else{
                hp.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> mapElement : hp.entrySet()) {
            int key = mapElement.getKey();
 
            
            int value = (mapElement.getValue());
            if(key==value){pq.add(key);n++;}
        }
        if(n==0){return -1;}
        return pq.peek();
    }
}