class Solution {
    
    public int smallestChair(int[][] times, int targetFriend) {
        int arr = times[targetFriend][0];
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<Integer>al = new ArrayList<>();
        
        for(int i = 0;i<times.length;i++){
            if(al.size() == 0){
                al.add(times[i][1]);
                if(times[i][0] == arr){return al.size()-1;}
            }
            else{boolean a = false;
            for(int j = 0;j<al.size();j++){
                if(al.get(j) <= times[i][0]){
                    al.remove(j);
                    al.add(j,times[i][1]);
                    a = true;
                    if(times[i][0] == arr){return j;}
                    break;
                }
            }
            if(a == false){al.add(times[i][1]);if(times[i][0] == arr){return al.size()-1;}}}
        }
        return 0;
    }
}