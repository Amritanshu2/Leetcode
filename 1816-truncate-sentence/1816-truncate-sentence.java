class Solution {
    public String truncateSentence(String s, int k) {
        String a = "";
        String[] array = s.split("\\s+");
        for(int i = 0;i<array.length && i<k ; i++){
            if(i == 0){
                a += array[i];
            }
            else{
                a += ' ';
                a += array[i];
            }
        }
        return a;
    }
}