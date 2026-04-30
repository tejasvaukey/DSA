class Solution {
    public void setZeroes(int[][] m) {
        boolean fr = false, fc = false;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(m[i][j] == 0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    m[0][j] = 0;
                    m[i][0] = 0;
                }
            }
        }
        for(int i=1; i<m.length; i++){
            for(int j=1; j<m[0].length; j++){
                if(m[i][0] == 0 || m[0][j] == 0) m[i][j] = 0;
            }
        }
        if(fr){
            for(int j=0; j<m[0].length; j++){
                m[0][j] = 0;
            }
        }
        if(fc){
            for(int i=0; i<m.length; i++){
                m[i][0] = 0;
            }
        }
        
    }
}