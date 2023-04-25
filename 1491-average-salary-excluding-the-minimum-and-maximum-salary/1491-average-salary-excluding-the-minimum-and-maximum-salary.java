class Solution {
    public double average(int[] salary) {
        
        Arrays.sort(salary);int ram = 0;
        for(int i = 1;i<salary.length-1;i++){
            ram += salary[i];
        }
        double avg = (double)ram/(salary.length-2);
        return avg;
    }
}