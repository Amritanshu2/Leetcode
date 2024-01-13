

class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (char key : hm.keySet()) {
            if (hs.containsKey(key)) {
                max += Math.abs(hs.get(key) - hm.get(key));
                hs.remove(key); // Corrected: Remove from hs, not hm
            } else {
                max += hm.get(key);
            }
        }

        for (char key : hs.keySet()) {
            max += hs.get(key);
        }

        return max;
    }
}
