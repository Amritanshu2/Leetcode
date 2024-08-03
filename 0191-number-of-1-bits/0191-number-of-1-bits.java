public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        return dtb(n);
    }
    
    public int dtb(int a){
        String s = "";int a1 = 0;
        while(a>0){
            if(a%2 == 1 ){a1++;}
            s += a%2;a/=2;
        }
        return a1;
    }
}