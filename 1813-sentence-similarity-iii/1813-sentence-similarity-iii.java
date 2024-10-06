class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String []arr = sentence1.split(" ");
        String []temp = sentence2.split(" ");
        return check(arr, temp) || check(temp,arr);
    }
    
    public boolean check(String[]arr1, String[] arr2){
        int i = 0;
        for(int j = 0;j<arr2.length && i<arr1.length;j++){
            if(arr1[i].equals(arr2[j])){
                i++;
            }
            else{break;}
        }
        int k = arr1.length-1;
        for(int j = arr2.length-1;k>=i && j>=0;j--){
            if(arr1[k].equals(arr2[j])){
                k--;
            }
            else{return false;}
        }
        return true;
    }
}