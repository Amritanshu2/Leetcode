class Solution {
    public int longestConsecutive(int[] arr) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], true);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i] - 1))
                hm.put(arr[i], false);
        }
        int maxlength = 0;
        int maxst = 0;
        for (int ele : arr) {
            if (hm.get(ele) == true) {
                int templn = 1;
                int tempst = ele;
                while (hm.containsKey(ele + templn)) {
                    templn++;
                }
                if (templn > maxlength) {
                    maxst = tempst;
                    maxlength = templn;
                }
            }
        }

        return maxlength;
    }
}