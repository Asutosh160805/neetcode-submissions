class NumMatrix {
    int[][] preFix;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        preFix = new int[row+1][col+1];
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                preFix[i][j] =  matrix[i - 1][j - 1]
                      + preFix[i - 1][j]
                      + preFix[i][j - 1]
                      - preFix[i - 1][j - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;row2++;col1++;col2++;
        int bottomRight = preFix[row2][col2];
        int topleft = preFix[row1-1][col1-1];
        int left = preFix[row2][col1-1];
        int above = preFix[row1-1][col2];
        return bottomRight-left-above+topleft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */