class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>st = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(words[i].contains(""+x)){
                st.add(i);
            }
        }
        return st;
    }
}