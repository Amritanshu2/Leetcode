class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>pq= new LinkedList<>();
        Stack<Integer>st= new Stack<>();
        for(int i = 1;i<=sandwiches.length;i++){
            st.push(sandwiches[students.length-i]);
        }
        for(int j = 0;j<students.length;j++){
            pq.add(students[j]);
        }
        int i = 0;
        while(i<students.length*4 && pq.size()>0 ){
            i++;
            if(pq.peek() == st.peek()){
                st.pop();pq.poll();
            }
            else if(pq.peek() != st.peek()){
                int a = pq.poll();pq.add(a);
            }
        }

        return st.size();
    }
}