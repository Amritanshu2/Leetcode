class Solution {
    public boolean isHappy(int num) {
        do{
            int j = 0;
            while(num >0){
                j = j + (num%10)*(num%10);
                num = num/10;
            }
       
            num = j;
        }while(num/10>0);
        System.out.println(num);
        if(num==1){return true;}
        if(num%2==0){return false;}
        return isHappy(num);
    }
}