class Solution {
    public boolean areNumbersAscending(String s) {
        int a = -(int)1e8;
        
        String[] arr = s.split(" ", 0);
        for(int i = 0;i<arr.length;i++){
            if(arr[i].charAt(0)-'0' <=9){
                if(Integer.parseInt(arr[i])<=a){return false;}
                a = Integer.parseInt(arr[i]);
            }
        }
        return true;
    }
}