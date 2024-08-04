import java.util.HashMap;

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
       
        HashMap<Integer, HashMap<Integer, Integer>> hm = new HashMap<>();

        
        for (int i = 0; i < pick.length; i++) {
            int player = pick[i][0];
            int color = pick[i][1];
            
            
            hm.putIfAbsent(player, new HashMap<>());
            
           
            hm.get(player).put(color, hm.get(player).getOrDefault(color, 0) + 1);
        }

        int winnerCount = 0;

        
        for (int player = 0; player < n; player++) {
            if (hm.containsKey(player)) {
                HashMap<Integer, Integer> colorCountMap = hm.get(player);
                for (int count : colorCountMap.values()) {
                    if (count > player) {
                        winnerCount++;
                        break;
                    }
                }
            }
        }

        return winnerCount;
    }
}
