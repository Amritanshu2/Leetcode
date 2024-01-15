class Solution {
    public List<List<Integer>> findWinners(int[][] m) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0;i<m.length;i++){
            hm.put(m[i][1], hm.getOrDefault(m[i][1], 0) + 1);
        }
        Set<Integer>al = new HashSet<>();
        List<Integer>l = new ArrayList<>();
        for(int i = 0;i<m.length;i++){
            if(!hm.containsKey(m[i][0])){al.add(m[i][0]);}
        }
        for (Integer key : hm.keySet()) {
            if(hm.get(key)==1){l.add(key);}
        }
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>asd = new ArrayList<>(al);
        Collections.sort(asd);
        Collections.sort(l);
        ans.add(asd);
        ans.add(l);
        return ans;
    }
    
}