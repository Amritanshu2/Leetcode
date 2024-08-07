import java.util.HashMap;

class Solution {
    
    private HashMap<Integer, String> hm = new HashMap<>();
    private HashMap<Integer, String> hm1 = new HashMap<>();

    public Solution() {
        
        hm.put(0, "Zero");
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");
        hm.put(6, "Six");
        hm.put(7, "Seven");
        hm.put(8, "Eight");
        hm.put(9, "Nine");
        
        
        hm1.put(10, "Ten");
        hm1.put(11, "Eleven");
        hm1.put(12, "Twelve");
        hm1.put(13, "Thirteen");
        hm1.put(14, "Fourteen");
        hm1.put(15, "Fifteen");
        hm1.put(16, "Sixteen");
        hm1.put(17, "Seventeen");
        hm1.put(18, "Eighteen");
        hm1.put(19, "Nineteen");
        hm1.put(20, "Twenty");
        hm1.put(30, "Thirty");
        hm1.put(40, "Forty");
        hm1.put(50, "Fifty");
        hm1.put(60, "Sixty");
        hm1.put(70, "Seventy");
        hm1.put(80, "Eighty");
        hm1.put(90, "Ninety");
    }
    
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return convert(num).trim();
    }
    
    private String convert(int num) {
        if (num < 20) return hm1.get(num) != null ? hm1.get(num) : hm.get(num);
        if (num < 100) return hm1.get(num / 10 * 10) + (num % 10 != 0 ? " " + hm.get(num % 10) : "");
        if (num < 1000) return hm.get(num / 100) + " Hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");
        if (num < 1000000) return convert(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");
        if (num < 1000000000) return convert(num / 1000000) + " Million" + (num % 1000000 != 0 ? " " + convert(num % 1000000) : "");
        return convert(num / 1000000000) + " Billion" + (num % 1000000000 != 0 ? " " + convert(num % 1000000000) : "");
    }
}
