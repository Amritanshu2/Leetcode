class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<Integer> al = findPrimes(n);
        Collections.sort(al);
        int left = 0;int right = al.size()-1;
        List<List<Integer>>ans = new ArrayList<>();
        while(left<=right){
            if(al.get(left)+al.get(right) <n){left++;continue;}
            if(al.get(left)+al.get(right) >n){right--;continue;}
            if(al.get(left)+al.get(right) == n){
                List<Integer>asd = new ArrayList<>();
                asd.add(al.get(left));asd.add(al.get(right));
                ans.add(asd);
                left++;right--;continue;}
        }
        return ans;
    }
    
    public static List<Integer> findPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        List<Integer> primes = new ArrayList<>();
        
        // Initialize all numbers from 2 to n as prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Mark multiples of prime numbers as non-prime
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Collect prime numbers into the list
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
}