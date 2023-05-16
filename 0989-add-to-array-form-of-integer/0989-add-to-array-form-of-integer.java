class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int size = 0;int rem = k;
        ArrayList<Integer>al = new ArrayList<>();
        while(k>0){
            k = k/10;size++;
        }
        
        int [] arr = new int[size];
        
        for(int i = size-1;i>=0;i--){
            arr[i] = rem%10;
            rem /= 10;
        }int jo = num.length;
        rem = 0;
        if(jo>=size){
            while(jo!=0 && size!=0){
                al.add(0,(num[jo-1] + arr[size-1] + rem)%10);
                rem = (num[jo-1] + arr[size-1] + rem)/10;jo = jo-1;size--;
            }
            while(jo!=0){
                al.add(0,(num[jo-1] + rem)%10);
                rem = (num[jo-1] + rem)/10;jo--;
            }
            if(rem!=0){al.add(0,rem);}
        }
        else{
            while(jo!=0 && size!=0){
                al.add(0,(num[jo-1] + arr[size-1] + rem)%10);
                rem = (num[jo-1] + arr[size-1] + rem)/10;jo = jo-1;size--;
            }
            while(size!=0){
                al.add(0,(arr[size-1] + rem)%10);
                rem = (arr[size-1] + rem)/10;size--;
            }
            if(rem!=0){al.add(0,rem);}
        }
        return al;
    }
}