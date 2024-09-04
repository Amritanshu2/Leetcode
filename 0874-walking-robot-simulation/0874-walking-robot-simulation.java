import java.util.HashSet;

class Solution {
    HashSet<String> hs = new HashSet<>();

    public int robotSim(int[] commands, int[][] obstacles) {
        int a = 0; int b = 0;
        int dir = 0;

        
        for (int[] obstacle : obstacles) {
            hs.add(obstacle[1] + "," + obstacle[0]);
        }

        int max = 0;

       
        for (int command : commands) {
            if (command == -1) {
                dir = (dir + 1) % 4; 
            } else if (command == -2) {
                dir = (dir + 3) % 4;
            } else {
                
                int[] newCoords = sum(a, b, dir, command);
                a = newCoords[0];
                b = newCoords[1];
                max = Math.max(max, a * a + b * b); 
            }
        }

        return max;
    }

    public int[] sum(int a, int b, int dir, int step) {
        for (int i = 0; i < step; i++) {
            if (dir == 0) { 
                if (!hs.contains((a + 1) + "," + b)) {
                    a++;
                }
            } else if (dir == 2) { 
                if (!hs.contains((a - 1) + "," + b)) {
                    a--;
                }
            } else if (dir == 1) { 
                if (!hs.contains(a + "," + (b + 1))) {
                    b++;
                }
            } else if (dir == 3) { 
                if (!hs.contains(a + "," + (b - 1))) {
                    b--;
                }
            }
        }

        return new int[]{a, b};
    }
}
