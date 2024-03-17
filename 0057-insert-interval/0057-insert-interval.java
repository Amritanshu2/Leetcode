class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(newInterval[0]);
        al.add(newInterval[1]);
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<intervals.length;i++){
            for(int j = 0;j<2;j++){
                if(al.size() == 2 && intervals[i][j]>al.get(0) && intervals[i][j]>al.get(1)){
                    if(j == 0){st.push(al.get(0));st.push(al.get(1));st.push(intervals[i][j]);al.remove(0);al.remove(0);}
                    if(j == 1){st.push(intervals[i][j]);al.remove(0);al.remove(0);}
                }
                
                else if(al.size() == 2 && intervals[i][j]>=al.get(0)){
                    if(j == 0){st.push(al.get(0));al.remove(0);}
                    if(j == 1){al.remove(0);}
                }
                
                else if (al.size()==1){
                    if(intervals[i][j]<al.get(0)){continue;}
                    else if(intervals[i][j]>al.get(0) && j == 0){st.push(al.get(0));st.push(intervals[i][j]);al.remove(0);}
                    else if(intervals[i][j]>al.get(0) && j == 1){st.push(intervals[i][j]);al.remove(0);}
                }
                else if(al.size() == 2 && intervals[i][j]<al.get(0)){st.push(intervals[i][j]);}
                else if (al.size() ==0){
                   
                        st.push(intervals[i][j]);
                    
                }
                
            }
        }
        while(al.size() != 0){
            st.push(al.get(0));
            al.remove(0);
        }
        int arr[][] = new int [st.size()/2][2];
        for(int i = arr.length-1; i>= 0; i--){
            for(int j = 1;j>=0;j--){
                arr[i][j] = st.pop();
            }
        }
        
        return arr;
        
    }
}