import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }
        Arrays.sort(workers);
        
        double minCost = Double.MAX_VALUE;
        int qualitySum = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        for (Worker worker : workers) {
            maxHeap.offer(worker.quality);
            qualitySum += worker.quality;
            if (maxHeap.size() > k) {
                qualitySum -= maxHeap.poll();
            }
            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, qualitySum * worker.costRatio);
            }
        }
        return minCost;
    }
    
    class Worker implements Comparable<Worker> {
        int quality;
        double costRatio;
        
        public Worker(int quality, int wage) {
            this.quality = quality;
            this.costRatio = (double) wage / quality;
        }
        
        public int compareTo(Worker other) {
            return Double.compare(this.costRatio, other.costRatio);
        }
    }
}
