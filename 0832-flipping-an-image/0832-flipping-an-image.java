class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        for(int i = 0;i<img.length;i++){
            for(int j = 0;j<img[0].length;j++){
                if(img[i][j] == 1){img[i][j] = 0;}
                else{img[i][j] = 1;}
            }
        }
        for(int i = 0;i<img.length;i++){
            for(int j = 0;j<img[0].length/2;j++){
                int temp = img[i][j];
                img[i][j] = img[i][img[0].length-1-j];
                img[i][img[0].length-1-j] = temp;
            }
        }
        return img;
    }
}