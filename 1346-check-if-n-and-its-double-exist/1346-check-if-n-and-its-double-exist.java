class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            
            if(hm.containsKey(arr[i])){hm.put(arr[i],hm.get(arr[i])+1);}
               else{hm.put(arr[i],1);}
        }
        for(int i = 0;i<arr.length;i++){
            
                if(hm.containsKey(arr[i]*2) && arr[i]!=0 ){return true;}
            if(arr[i]==0 && hm.get(0)>=2){return true;}
            
        }
        return false;
    }
}