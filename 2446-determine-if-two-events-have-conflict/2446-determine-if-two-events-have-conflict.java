class Solution {
    public boolean haveConflict(String[] ev, String[] eve) {
        int []arr = new int[2];int hr = 0;
        for(int i = 0;i<2;i++){int j = 0;String h = "";
        while(j<2){
            h = h + ev[i].charAt(j);j++;
        }
        hr = (Integer.parseInt(h))*60; j =3;h= "";
        while(j<5){
            h = h + ev[i].charAt(j);j++;
        }
        hr = hr + Integer.parseInt(h);
        arr[i] = hr;}
        
        int []crr = new int[2];
        for(int i = 0;i<2;i++){int j = 0;String h = "";
        while(j<2){
            h = h + eve[i].charAt(j);j++;
        }
        hr = (Integer.parseInt(h))*60; j =3;h= "";
        while(j<5){
            h = h + eve[i].charAt(j);j++;
        }
        hr = hr + Integer.parseInt(h);
        crr[i] = hr;}
        if(crr[0]<=arr[1] && crr[1]>=arr[0] ){return true;}
        return false;
    }
}