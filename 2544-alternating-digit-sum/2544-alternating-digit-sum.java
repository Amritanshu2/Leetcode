class Solution {
    public int alternateDigitSum(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(num > 0){
                arr.add(0,num%10);
                num = num/10;
            }int add=0;
        for(int i = 0;i<arr.size();i++){
            add += arr.get(i);i++;
        }
        int sub = 0;
        for(int i = 1;i<arr.size();i++){
            sub += arr.get(i);i++;
        }
        return add-sub;
    }
}