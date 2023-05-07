class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int []ans = new int[hm.size()];int i = 0;
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            int value = mapElement.getValue();
            ans[i] = value;i++;
        }
        Arrays.sort(ans);
        for(int j = 0;j<ans.length-1;j++){
            if(ans[j]==ans[j+1]){
                return false;
            }
        }
        return true;
    }
}