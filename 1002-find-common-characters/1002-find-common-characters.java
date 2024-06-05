class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            char c = words[0].charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i1 = 1; i1 < words.length; i1++) {
            HashMap<Character, Integer> sa = new HashMap<>();
            for (int i = 0; i < words[i1].length(); i++) {
                char c = words[i1].charAt(i);
                if (hm.containsKey(c) && hm.get(c) > 0) {
                    sa.put(c, sa.getOrDefault(c, 0) + 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                char key = entry.getKey();
                if (sa.containsKey(key)) {
                    hm.put(key, Math.min(entry.getValue(), sa.get(key)));
                } else {
                    hm.put(key, 0);
                }
            }
        }

        List<String> al = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            char key = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                al.add(String.valueOf(key));
            }
        }
        return al;
    }
}