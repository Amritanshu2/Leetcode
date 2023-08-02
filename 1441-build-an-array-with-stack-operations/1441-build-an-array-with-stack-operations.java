class Solution {
    public List<String> buildArray(int[] tar, int n) {
        List<String> s = new ArrayList<>();int i = 1;int g =0;
        while(g<tar.length){
            if(tar[g] == i ){s.add("Push");i++;g++;}
            else{s.add("Push");s.add("Pop");i++;}
        }
        return s;
    }
}