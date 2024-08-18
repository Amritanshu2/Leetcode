class Solution {
    
    long arr[][];
    
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        
        arr = new long[energyDrinkA.length][2];
        
        long a = max(1,energyDrinkA,energyDrinkB,0)+energyDrinkA[0];
        long b = max(1,energyDrinkA,energyDrinkB,1)+energyDrinkB[0];
        return Math.max(a,b);
    }
    
    
    public long max(int i ,int[] energy, int[] ene, int box){
        if(i == energy.length){return 0;}
        long a = 0;
        
        if(arr[i][box] != 0)return arr[i][box];
        
        if(box == 0){
            a = Math.max(a,max(i+1,energy,ene,0)+energy[i]);
            a = Math.max(a,max(i+1,energy,ene,1));
            arr[i][0] = a;
            return a;
        }
        
        if(box == 1){
            a = Math.max(a,max(i+1,energy,ene,1)+ene[i]);
            a = Math.max(a,max(i+1,energy,ene,0));
            arr[i][1] = a;
            return a;
        }
        return a;
    }
}