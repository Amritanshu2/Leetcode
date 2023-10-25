class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // ArrayList<String>al = new ArrayList<>();
        int a = (int)1e8;
        HashMap<String,Integer>hm = new HashMap<>();
        HashSet<String>al = new HashSet<>();
        for(int i = 0;i<list1.length;i++){
            hm.put(list1[i],i);
        }
        for(int i = 0;i<list2.length;i++){
            if(hm.containsKey(list2[i])){
                if(i+hm.get(list2[i])<a){a= i+hm.get(list2[i]);al.clear();al.add(list2[i]);}
                if(i+hm.get(list2[i])==a){al.add(list2[i]);}
            }
            
        }
        String[] num = al.toArray(new String[al.size()]);
        return num;
    }
}