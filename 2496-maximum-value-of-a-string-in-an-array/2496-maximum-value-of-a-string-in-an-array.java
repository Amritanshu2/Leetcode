class Solution {
    public int maximumValue(String[] strs) {
        HashSet<Character>hs = new HashSet<>();
        hs.add('1');hs.add('2');hs.add('3');hs.add('4');hs.add('5');hs.add('6');hs.add('7');hs.add('8');hs.add('9');hs.add('0');int max = 0;
        for(int i = 0;i<strs.length;i++){
            int h = 0;
            for(int j = 0;j<strs[i].length();j++){
                if(!hs.contains(strs[i].charAt(j))){
                    max = Math.max(max,strs[i].length());h++;
                    break;
                }
                
            }
            if(h==0){
                max = Math.max(max,Integer.parseInt(strs[i]));
            }
        }
        return max;
    }
}