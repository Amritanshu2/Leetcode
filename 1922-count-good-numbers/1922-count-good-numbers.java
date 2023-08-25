class Solution {
    public long m = 1_000_000_007;
    
    long mod=1000000007;
    long pow(long x, long n)
    {
        if(n==1)return x;
        if(n==0)return 1;
        long smallPow=pow(x,n/2);
        if(n%2==1)
        {
            return (smallPow%mod*smallPow%mod*x%mod)%mod;
        }
        return (smallPow%mod*smallPow%mod)%mod;
    }
    public int countGoodNumbers(long n) {
        long oddInd = n/2;
        long eveInd = n/2 + n%2;
        return (int)((pow(5,eveInd)%mod*pow(4,oddInd)%mod)%mod);
    }
}