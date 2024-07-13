class Solution {
    
    public class col{
        int pos;
        int heal;
        char dir;
        int init;
        col(int pos, int heal, char dir, int init){
            this.pos = pos;
            this.heal = heal;
            this.dir = dir;
            this.init = init;
        }
    }
    
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        col[]arr = new col[positions.length];
        for(int i = 0;i<positions.length;i++){
            arr[i] = new col(positions[i],healths[i],directions.charAt(i),i);
        }
         Arrays.sort(arr, Comparator.comparingInt(c -> c.pos));
        
        Stack<col> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            if(st.size() == 0 || st.peek().dir == arr[i].dir || st.peek().dir == 'L' && arr[i].dir == 'R'){
                st.push(arr[i]);
            }
            else{
                
                if(st.peek().heal == arr[i].heal){st.pop();}
                else if (st.peek().heal > arr[i].heal){st.peek().heal = st.peek().heal-1;}
                else{
                    while (!st.isEmpty() && arr[i]!=null && st.peek().dir != arr[i].dir && !(st.peek().dir == 'L' && arr[i].dir == 'R')) {
                        if (st.peek().heal == arr[i].heal) {
                            st.pop();arr[i] = null;
                        } else if (st.peek().heal > arr[i].heal) {
                            st.peek().heal--;arr[i] = null;
                        } else {
                            st.pop();
                            arr[i].heal--;
                            
                        }
                    }
                    if (arr[i] != null && ( st.isEmpty() || st.peek().dir == arr[i].dir || st.peek().dir == 'L' && arr[i].dir == 'R')) {
                        st.push(arr[i]);
                    }
                }
            
            }
        }
        
        List<col>al = new ArrayList<>();
        while(st.size()!=0){
            al.add(st.pop());
        }
        Collections.sort(al, Comparator.comparingInt(c -> c.init));
        List<Integer>as = new ArrayList<>();
        for(int i = 0;i<al.size();i++){
            as.add(al.get(i).heal);
        }
        return as;
        
    }
}