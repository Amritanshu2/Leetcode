class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String>hs = new HashSet<>();
        for(int i = 0;i<bannedWords.length;i++){
            hs.add(bannedWords[i]);
        }
        int a = 0;
        for(int i = 0;i<message.length;i++){
            if(hs.contains(message[i])){a++;if(a==2)return true;}
        }
        return false;
    }
}