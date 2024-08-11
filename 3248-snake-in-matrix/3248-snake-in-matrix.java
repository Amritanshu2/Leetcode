class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int a = 0,b = 0;
        for(int i = 0;i<commands.size();i++){
            if(commands.get(i).equals("DOWN")){a++;}
            else if(commands.get(i).equals("UP")){a--;}
            else if(commands.get(i).equals("LEFT")){b--;}
            else if(commands.get(i).equals("RIGHT")){b++;}
        }
        return a*n+b;
    }
}