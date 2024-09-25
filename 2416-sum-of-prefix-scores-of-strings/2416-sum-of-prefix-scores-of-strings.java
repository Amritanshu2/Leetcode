class Solution {
    public int[] sumPrefixScores(String[] words) {
        char[][] wordies = new char[words.length][];
        Trie myTrie = new Trie();
        for(int index = 0; index<wordies.length; index++){
            wordies[index] = words[index].toCharArray();
            myTrie.add(wordies[index]);
        }
        int[] res = new int[words.length];
        for(int i = 0; i<words.length; i++){
            res[i] = myTrie.get(wordies[i]);
        }
        return res;
    }
}

class Trie{
    Trie[] subtrie;
    int nowords;
    public Trie(){
        subtrie = new Trie[26];
        nowords = 0;
    }

    public void add(char[] word){
        add(word, 0);
        return;
    }

    private void add(char[] word, int index){
        nowords++;
        if(index == word.length){return;}
        if(subtrie[word[index]-'a'] == null){
            subtrie[word[index]-'a'] = new Trie();
        }
        subtrie[word[index]-'a'].add(word, index+1);
    }

    public int get(char[] word){
        if(subtrie[word[0]-'a'] == null){return 0;}
        return subtrie[word[0]-'a'].get(word, 1);
    }

    private int get(char[] word, int index){
        if(index == word.length || subtrie[word[index]-'a'] == null){ return nowords;}
        return nowords + subtrie[word[index]-'a'].get(word, index+1);
    }
}