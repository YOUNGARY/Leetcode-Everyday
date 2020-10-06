class Solution {
    public int numSpecial(int[][] mat) {
        int rowLen = mat.length, colLen = mat[0].length;
        int cnt = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (mat[i][j] == 1) {
                    if (isSpecial(mat, i, j)) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    boolean isSpecial(int[][] mat, int row, int col) {
        int rowCount = 0, colCount = 0;
        for(int j = 0; j < mat[0].length; j++) {
            if (mat[row][j] == 1) {
                rowCount++;
            }
            if (rowCount > 1) {
                return false;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] == 1) {
                colCount++;
            }
            if (colCount > 1) {
                return false;
            }
        }
        return rowCount == 1 && colCount == 1;
    }
}