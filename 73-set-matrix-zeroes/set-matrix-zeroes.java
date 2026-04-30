class Solution {
    public void setZeroes(int[][] m) {
        boolean[] col = new boolean[m[0].length];
        boolean[] row = new boolean[m.length];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(m[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(row[i] == true || col[j] == true) m[i][j] = 0;
            }
        }
        
    }
}