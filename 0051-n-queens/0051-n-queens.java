class Solution {
    
    List<List<String>>ans = new ArrayList<>();
    int[][]vis;int[]nums;
    public List<List<String>> solveNQueens(int n) {
        String s = ""; vis = new int[n][n];nums = new int[n];
        for(int i = 0;i<n;i++){
            vis[0][i] = 1;nums[i] = 1;
            List<String>al = new ArrayList<>();
            al.add(s+'Q'+ createStringOfDots(n-1-i));
            hlpr(1,n,"",al);
            al.remove(al.size()-1);
            vis[0][i] = 0; nums[i] = 0;  
            s+=".";
        }
        return ans;
        
    }
    
    public void hlpr(int i, int size, String s, List<String>al){
        if(i == size){ans.add(new ArrayList<>(al));return;}
        for(int j = 0;j<size;j++){
            if(nums[j]!=1 && !checkDiagonalsAbove(vis,i,j)){
                al.add(s+'Q'+createStringOfDots(size-1-j));
                vis[i][j] = 1;nums[j] = 1;
                hlpr(i+1,size,"",al);
                al.remove(al.size()-1);
                vis[i][j] = 0;nums[j] = 0;
            }
            s+=".";
        }
    }
    
    public static boolean checkDiagonalsAbove(int[][] matrix, int row, int col) {
        // Check top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) {
                return true;
            }
        }
        
        // Check top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < matrix[0].length; i--, j++) {
            if (matrix[i][j] == 1) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public static String createStringOfDots(int x) {
        StringBuilder sb = new StringBuilder(x);
        for (int i = 0; i < x; i++) {
            sb.append('.');
        }
        return sb.toString();
    }
}