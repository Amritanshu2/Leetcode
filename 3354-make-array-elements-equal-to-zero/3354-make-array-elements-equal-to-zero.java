class Solution {
    public int countValidSelections(int[] nums) {
        int ways = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
               
                if (check(-1, i, nums.clone())) ways++;
                if (check(1, i, nums.clone())) ways++;
            }
        }
        return ways;
    }

    public boolean check(int dir, int pos, int[] arr) {
        while (pos >= 0 && pos < arr.length) {
            if (arr[pos] == 0) {
                pos += dir;    
            } else {
                arr[pos] = arr[pos]-1;
                dir = -dir;   
                pos += dir;
            }
        }
        for (int num : arr) {
            if (num != 0) return false; 
        }
        return true;
    }
}
