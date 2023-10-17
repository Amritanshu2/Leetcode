class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i : asteroids){
            if(i > 0){
                s.push(i);
            }else{
                while(s.size() > 0 && s.peek() > 0 && s.peek() < -i  ){
                    s.pop();
                    
                }
                if(s.size() > 0 && s.peek() == -i ){
                    s.pop();continue;
                    
                }
                else if(s.size() > 0 && s.peek() > -i ){
                    continue;
                }
                
                    s.push(i);
                
            }
        }
        
        int arr[] = new int[s.size()];
        for(int j = arr.length - 1 ; j >=0;j-- ){
            arr[j] = s.pop();
        }
        return arr;}
}