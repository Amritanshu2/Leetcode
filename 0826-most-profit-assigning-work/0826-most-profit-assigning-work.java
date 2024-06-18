class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
         int n = difficulty.length;
        int m = profit.length;
        int o = worker.length;

        Map<Integer,Integer> map = new HashMap();

       for (int i = 0; i < n; i++) {
            map.put(difficulty[i], Math.max(map.getOrDefault(difficulty[i], 0), profit[i]));
        }

        Arrays.sort(difficulty);
        Arrays.sort(worker);

        int prof = 0;
        int maxProfit = 0;
        int j = 0;

        for (int i = 0; i < o; i++) {
            while (j < n && worker[i] >= difficulty[j]) {
                maxProfit = Math.max(maxProfit, map.get(difficulty[j]));
                j++;
            }
            prof += maxProfit;
        }

        return prof;
    }
    
    }
