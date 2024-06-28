class Solution {
    public long maximumImportance(int n, int[][] roads) {
        HashMap<Integer,Long>hm = new HashMap<>();
        for(int i = 0;i<roads.length;i++){
            for(int j = 0;j<roads[0].length;j++){
                hm.put(roads[i][j],hm.getOrDefault(roads[i][j],0L)+1);
            }
        }
        
        List<Map.Entry<Integer, Long>> list = new ArrayList<>(hm.entrySet());
        
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        LinkedHashMap<Integer, Long> sortedHm = new LinkedHashMap<>();
        for (Map.Entry<Integer, Long> entry : list) {
            sortedHm.put(entry.getKey(), entry.getValue());
        }
        int j = n;long sum = 0;
        for (Map.Entry<Integer, Long> entry : sortedHm.entrySet()) {
            sum+= entry.getValue()*j;j--;
        }
        return sum;
    }
}