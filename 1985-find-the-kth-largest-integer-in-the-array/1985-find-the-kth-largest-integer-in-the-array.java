import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {

   
    public class CustomString {
        String value;

        CustomString(String value) {
            this.value = value;
        }
    }

    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); 
                }
                return Integer.compare(s1.length(), s2.length()); 
            }
        });

        
        for (String num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); 
            }
        }

        return pq.poll(); 
    }
}
