class Solution {
    public int compareVersion(String version1, String version2) {
        String[] array = version1.split("\\.");
        String[] array1 = version2.split("\\.");
        int num[] = new int[array.length];
        for(int i = 0;i<array.length;i++){
            num[i] = Integer.parseInt(array[i]);
        }
        int num1[] = new int[array1.length];
        for(int i = 0;i<array1.length;i++){
            num1[i] = Integer.parseInt(array1[i]);
        }
        int i = 0;
        while(i<num.length || i<num1.length){
            if(i>=num.length){
                if(num1[i] != 0){return -1;}
                
            }
            else if(i>=num1.length){
                if(num[i] != 0){return 1;}
            }
            else{
                if(num[i]>num1[i]){return 1;}
                if(num1[i]>num[i]){return -1;}
            }
            i++;
        }
        return 0;
    }
} 