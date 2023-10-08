class Solution {
    public String sortSentence(String s) {
        String A = "";
        for(int i = 0;i<s.length();i++){
            A = A + s.charAt(s.length()-1-i);
        }
        String[] arr = A.split(" ", 0);
        Arrays.sort(arr);
        String g = "";
        for(int i = 0;i<arr.length;i++){
            for(int j = arr[i].length()-1;j>0;j--){
                g += arr[i].charAt(j);
            }
            if(i<arr.length-1){g+=' ';}
        }
        return g;
        
    }
}