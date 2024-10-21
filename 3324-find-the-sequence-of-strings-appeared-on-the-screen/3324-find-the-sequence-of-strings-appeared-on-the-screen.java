class Solution {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        String nextChar = "abcdefghijklmnopqrstuvwxyz";
        for(int i =0 ;i < target.length() ;i++){
            int j =0;
            while(target.charAt(i) != nextChar.charAt(j)){
                StringBuilder tempStr1 = new StringBuilder(target.substring(0,i));
                result.add(tempStr1.append(nextChar.charAt(j)).toString());
                j++;
            }
            result.add(target.substring(0,i+1).toString());
        }
        return result;
    }
}