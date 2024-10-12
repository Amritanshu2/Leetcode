class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while (word.length() < k) {
            String add = "";
            for (char ch : word.toCharArray()) {
                if (ch == 'z') {
                    add = add + 'a';
                } else {
                    add = add + (char) (ch + 1);
                }
            }
            word = word + add;
        }
        return word.charAt(k - 1);
    }
}