import java.util.Arrays;

class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        
        int h = horizontalCut.length;
        int v = verticalCut.length;
        
        int horizontalPieces = 1;
        int verticalPieces = 1;
        
        int i = h - 1;
        int j = v - 1;
        
        int cost = 0;
        
        while (i >= 0 && j >= 0) {
            if (horizontalCut[i] > verticalCut[j]) {
                cost += horizontalCut[i] * verticalPieces;
                horizontalPieces++;
                i--;
            } else {
                cost += verticalCut[j] * horizontalPieces;
                verticalPieces++;
                j--;
            }
        }
        
        while (i >= 0) {
            cost += horizontalCut[i] * verticalPieces;
            i--;
        }
        
        while (j >= 0) {
            cost += verticalCut[j] * horizontalPieces;
            j--;
        }
        
        return cost;
    }
}
