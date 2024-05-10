class Solution {
    
    public class frac{
        int a ;
        int b ;
        double frac;
        frac(int a ,int b, double frac){
            this.a = a;
            this.b = b;
            this.frac = frac;
        }
    }
    
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[]ans = new int[2];
        HashMap<Double,frac> hm = new HashMap<>();
        PriorityQueue<Double>pq = new PriorityQueue<>();
        
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                double aa = (double)arr[i]/(double)arr[j];
                hm.put(aa,new frac(arr[i],arr[j],aa));
                pq.add(aa);
            }
        }
        for(int i = 0;i<k-1;i++){
            pq.remove();
        }
        frac asd = hm.get(pq.poll());
        ans[0] = asd.a;ans[1] = asd.b;
        return ans;
    }
}