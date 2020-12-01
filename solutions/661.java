class Solution {
    public int[][] imageSmoother(int[][] M) {
        int rowLen = M.length, colLen = M[0].length;
        int[][] ans = new int[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                int cnt = 0;
                for (int k = i - 1; k < rowLen && k <= i + 1; k++) {
                    for (int p = j - 1; p < colLen && p <= j + 1; p++) {
                        if (k >= 0 && p >= 0) {
                            ans[i][j] += M[k][p];
                            cnt++;
                        }
                    }
                }
                ans[i][j] /= cnt;
            }
        }
        return ans;
    }
}