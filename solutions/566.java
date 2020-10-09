class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rowLen = nums.length, colLen = nums[0].length;
        if (rowLen * colLen != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int rowIdx = 0, colIdx = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                res[rowIdx][colIdx] = nums[i][j];
                colIdx++;
                if (colIdx % c == 0) {
                    rowIdx++;
                    colIdx = 0;
                }
            }
        }
        return res;
    }
}