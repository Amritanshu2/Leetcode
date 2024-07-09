class Solution {
    public double averageWaitingTime(int[][] customers) {
        int st = customers[0][0]+customers[0][1];
        long tot = customers[0][1];
        for(int i = 1;i<customers.length;i++){
            if(customers[i][0]<st){
                tot += st+customers[i][1]-customers[i][0];
                
                st += customers[i][1];
            }
            else{
                tot += customers[i][1];
                st = customers[i][0]+customers[i][1];
            }
            System.out.println(tot);
        }
        return (double)tot/customers.length;
    }
}