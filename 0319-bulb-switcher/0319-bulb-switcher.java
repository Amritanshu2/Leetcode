class Solution {
    public int bulbSwitch(int n) {
       
        // int[] arr = new int[n];
//         Arrays.fill(arr,0);
//         for(int i = 1;i<=n;i++){
//             for(int j = i;j<=n;j = j+i){
//                 if(arr[j-1] == 0){arr[j-1] = 1;}
//                 else{arr[j-1] = 0;}
//             }
//         }
        
         int m =0;
//         for(int i = 0;i<n;i++){
//             if(arr[i]==1){m++;}
            
//         }
        for(int i = 1;i*i<=n;i++){
            m++;
        }
        return m;
    }
}