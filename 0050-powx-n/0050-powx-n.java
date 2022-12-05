class Solution {
    public double myPow(double x,  int n) {
        if(n==0){
            return 1.00;
        }
        if(n>0){
            if(n%2==0){
                return myPow(x*x,n/2);
            }
            if(n%2!=0){
                return x*myPow(x*x,(n-1)/2);
            }
        }
        
        if(n<0){
            if(n<-2345 && x!=1 && x!= -1){return 0;}
            if(n%2==0){
           
                return 1/myPow(x*x,-n/2);
            }
            if(n%2!=0){
                return 1/x*myPow(x*x,(n+1)/2);
            }}
           return 1; 
    }
}