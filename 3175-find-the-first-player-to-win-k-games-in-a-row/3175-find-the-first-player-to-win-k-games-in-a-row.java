public class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        
        // Handling case where k is larger than or equal to the number of players
        if (k >= n) {
            int maxSkill = skills[0];
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (skills[i] > maxSkill) {
                    maxSkill = skills[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
        }

        // Initialize the current champion and consecutive win count
        int currentChampion = skills[0];
        int consecutiveWins = 0;
        int championIndex = 0;

        // Start comparing from the second player
        for (int i = 1; i < n; i++) {
            if (currentChampion >= skills[i]) {
                consecutiveWins++;
            } else {
                currentChampion = skills[i];
                championIndex = i;
                consecutiveWins = 1;
            }

            // If the current champion wins k times consecutively, return their index
            if (consecutiveWins == k) {
                return championIndex;
            }
        }

        // If we haven't found a winner after one pass, continue in a circular manner
        for (int i = 0; consecutiveWins < k; i++) {
            // Use modulo to loop back to the start of the array
            int nextChallenger = skills[i % n];
            if (currentChampion >= nextChallenger) {
                consecutiveWins++;
            } else {
                currentChampion = nextChallenger;
                championIndex = i % n;
                consecutiveWins = 1;
            }

            // Check again if the current champion has won k times consecutively
            if (consecutiveWins == k) {
                return championIndex;
            }
        }

        // Return the index of the champion
        return championIndex;
    }
}
