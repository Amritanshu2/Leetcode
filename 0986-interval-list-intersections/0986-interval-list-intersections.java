import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int a = 0;
        int b = 0;
        List<List<Integer>> al = new ArrayList<>();

        while (a < firstList.length && b < secondList.length) {
            
            int start = Math.max(firstList[a][0], secondList[b][0]);
            int end = Math.min(firstList[a][1], secondList[b][1]);

            
            if (start <= end) {
                List<Integer> as = new ArrayList<>();
                as.add(start);
                as.add(end);
                al.add(as);
            }

            
            if (firstList[a][1] < secondList[b][1]) {
                a++;
            } else {
                b++;
            }
        }

        
        int[][] arr = new int[al.size()][2];
        for (int i = 0; i < al.size(); i++) {
            arr[i][0] = al.get(i).get(0);
            arr[i][1] = al.get(i).get(1);
        }

        return arr;
    }
}
