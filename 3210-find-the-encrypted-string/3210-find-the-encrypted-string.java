class Solution {
    public String getEncryptedString(String s, int k) {
        Queue<Character>pq = new LinkedList<>();
        for(int i = 0;i<s.length();i++){
            pq.add(s.charAt(i));
        }
        for(int i = 0;i<k;i++){
            char a = pq.remove();
            pq.add(a);
        }
        String sa = "";
        for(int i = 0;i<s.length();i++){
            char a = pq.remove();
            sa += a;
            pq.add(a);
        }
        return sa;
    }
}