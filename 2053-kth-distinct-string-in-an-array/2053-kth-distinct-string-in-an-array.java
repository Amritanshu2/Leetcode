class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String>al = new ArrayList<>();
        HashMap<String,Integer>hs = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i], 0)+1);
        }
        for(int i = 0;i<arr.length;i++){
            if(hs.get(arr[i])==1){al.add(arr[i]);}
        }
        if(k>al.size()){return "";}
        return al.get(k-1);
    }
}