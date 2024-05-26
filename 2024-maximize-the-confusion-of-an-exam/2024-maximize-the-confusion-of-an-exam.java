class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max = 0;
        max = Math.max(max, maxConsecutive(answerKey, k, 'T'));
        max = Math.max(max, maxConsecutive(answerKey, k, 'F'));
        return max;
    }
    
    private int maxConsecutive(String answerKey, int k, char target) {
        int left = 0, right = 0, max = 0, flips = 0;
        
        while (right < answerKey.length()) {
            if (answerKey.charAt(right) != target) {
                flips++;
            }
            
            while (flips > k) {
                if (answerKey.charAt(left) != target) {
                    flips--;
                }
                left++;
            }
            
            max = Math.max(max, right - left + 1);
            right++;
        }
        
        return max;
    }
}
