// class Solution {
//     public int nthUglyNumber(int n) {
//         int a = 0;int count = 1;
//         while(a<n){
//             if(asd(count,0)){a++;}
            
//             if(a==n){return count;}count++;
//         }
//         return -1;
//     }
    
//     HashMap<Integer,Boolean>hm = new HashMap<>();
    
//     public boolean asd(int n,int count ){
//         if(n == 1){return true;}
//         if(hm.containsKey(n)){return hm.get(n);}
//         int i = 2;boolean s = false;;
//         while(i<=5){
//             if(n%i==0 && (i==2 || i==3 || i==5)){s = asd(n/i,count);break;}
//             else{i++;}
//         }
//         hm.put(n,s);
//         return s;
//     }
// }

class Solution {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;

        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            uglyNumbers[i] = min;

            if (min == factor2) {
                index2++;
                factor2 = 2 * uglyNumbers[index2];
            }

            if (min == factor3) {
                index3++;
                factor3 = 3 * uglyNumbers[index3];
            }

            if (min == factor5) {
                index5++;
                factor5 = 5 * uglyNumbers[index5];
            }
        }

        return uglyNumbers[n - 1];
    }
}
