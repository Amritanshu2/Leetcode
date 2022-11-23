class Solution {
    public void rotate(int[] arr, int digit) {
       if(digit>arr.length)
        digit = digit%arr.length;

        else if(digit<0)
        digit = digit%arr.length + arr.length;



        int[] cpr = new int[arr.length];
        for(int m =0 ;m<arr.length;m++){
            cpr[m] = arr[m];
        }


        int i = arr.length - 1;
        int j = i - digit;
        for (int l = 0; l < digit; l++) {
            
            arr[l] = arr[j + 1];
            j++;
        }int m = 0;
        for (int u = digit; u <= i; u++) {
            
            arr[u] = cpr[m];
            m++;

        }
        for (int k = 0; k <= i; k++)
            System.out.print(arr[k]+" "); 
    }
}