class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        
        // Iterate through each element and check for increasing and decreasing sequences
        for (int i = 0; i < n; i++) {
            int lessLeft = 0, greaterLeft = 0, lessRight = 0, greaterRight = 0;
            
            // Count elements less and greater on the left
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) lessLeft++;
                if (rating[j] > rating[i]) greaterLeft++;
            }
            
            // Count elements less and greater on the right
            for (int k = i + 1; k < n; k++) {
                if (rating[k] < rating[i]) lessRight++;
                if (rating[k] > rating[i]) greaterRight++;
            }
            
            // Calculate number of valid teams with current element as the middle element
            count += lessLeft * greaterRight + greaterLeft * lessRight;
        }
        
        return count;
    }
}
