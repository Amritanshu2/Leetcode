class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int count1=0,count2=0;
        int r1=red,b1=blue;
        int r2=red,b2=blue;
        boolean bl=true;
        while(r1>=0 && b1>=0) {
            count1++;
            if (bl) {
                if(b1>= count1) {
                    b1-= count1;
                } 
                else{
                    break;
                }
            } 
            else{
                if(r1 >= count1) {
                    r1 -= count1;
                } 
                else{
                    break;
                }
            }
            bl = !bl;
        }
        boolean re=true;
        while (r2 >= 0 && b2 >= 0) {
            count2++;
            if (re) {
                if(r2>=count2) {
                    r2-=count2;
                } 
                else{
                    break;
                }
            } 
            else{
                if(b2 >= count2) {
                    b2 -= count2;
                } 
                else{
                    break;
                }
            }
            re = !re;
        }
        return Math.max(count1-1,count2-1); 
    }
}