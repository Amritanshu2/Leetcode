class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = ""+low;
        int min = s.length();
        s = ""+high;
        int max = s.length();
        s = "123456789";
        List<Integer>al = new ArrayList<>();
        for(int i = min;i<=max;i++){
            for(int j = 0;j+i<=9;j++){
                String ans = s.substring(j,j+i);
                if(low <= Integer.parseInt(ans) && Integer.parseInt(ans)<=high){
                    al.add(Integer.parseInt(ans));
                }
                if(Integer.parseInt(ans)>high){return al;}
            }
        }
        return al;
    }
}