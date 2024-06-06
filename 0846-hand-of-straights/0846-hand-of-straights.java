class Solution {
    HashSet<Integer> hs = new HashSet<>();

    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        for (int i = 0; i < hand.length; i++) {
            if (hs.contains(i)) {
                continue;
            }
            if (!check(hand, groupSize, i)) {
                return false;
            }
        }
        return hs.size() == hand.length;
    }

    public boolean check(int[] arr, int size, int s) {
        if (arr.length - s < size) {
            return false;
        }
        hs.add(s);
        int lastValue = arr[s];
        int count = 1;
        for (int i = s + 1; i < arr.length && count < size; i++) {
            if (hs.contains(i)) {
                continue;
            }
            if (arr[i] == lastValue + 1) {
                lastValue = arr[i];
                hs.add(i);
                count++;
            }
        }
        return count == size;
    }
}