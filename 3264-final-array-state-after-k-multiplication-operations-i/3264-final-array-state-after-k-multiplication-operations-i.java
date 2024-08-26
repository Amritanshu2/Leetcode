class Solution {
    
    public class Num implements Comparable<Num> {
    private int val;
    private int pos;

    public Num(int val, int pos) {
        this.val = val;
        this.pos = pos;
    }

    @Override
    public int compareTo(Num other) {
        
        int valComparison = Integer.compare(this.val, other.val);
        if (valComparison != 0) {
            return valComparison;
        }

        
        return Integer.compare(this.pos, other.pos);
    }
    }
    
    
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Num>pq = new PriorityQueue<>();
        for(int i = 0;i<nums.length;i++){
            pq.add(new Num(nums[i],i));
        }
        
        while(k>0){
            Num a = pq.remove();
            a.val = a.val*multiplier;
            k--;
            pq.add(a);
        }
        for(int i = 0;i<nums.length;i++){
            Num temp = pq.remove();
            nums[temp.pos] = temp.val;
        }
        return nums;
    }
}