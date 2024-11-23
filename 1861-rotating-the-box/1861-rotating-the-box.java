class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;  
        int n = box[0].length; 

        
        char[][] arr = new char[n][m];

        
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }

        
        for (int i = 0; i < m; i++) {
            int pos = n - 1; 
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                   
                    arr[j][m - 1 - i] = '*';
                    pos = j - 1; 
                } else if (box[i][j] == '#') {
                    
                    arr[pos][m - 1 - i] = '#';
                    pos--;
                }
               
            }
        }

        return arr;
    }
}
