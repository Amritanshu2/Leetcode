class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        ArrayList<Integer> al = new ArrayList<>();

        for (Integer element : tokens) {
            al.add(element);
        }
        Collections.sort(al);
        check(al,power,0);
        return a;
    }
    int a  = 0;
    public void check(ArrayList<Integer>al,int power, int score){
        a = Math.max(a,score);
        if(al.size() == 0){return;}
        if(power < al.get(0) && score == 0){return;}
       
        if(power < al.get(0) && score>0){
            
            int s = al.get(al.size()-1);
            al.remove(al.size()-1);
            
            
            check(al,power+s,score-1);
            al.add(s);
            
        }
        
        if(power >= al.get(0)){
            
            int s = al.get(0);
            al.remove(0);
            
            
            check(al,power-s,score+1);
            al.add(0,s);
            
        }
    }
}