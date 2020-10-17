class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rowLen = grid.length, colLen = grid[0].length;
        int[] rows = new int[rowLen];
        int[] cols = new int[colLen];

        int sum = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (grid[i][j] > rows[i]) {
                    rows[i] = grid[i][j];
                }
                if (grid[i][j] > cols[j]) {
                    cols[j] = grid[i][j];
                }
                sum += grid[i][j];
            }
        }

        int ans = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (grid[i][j] != rows[i] && grid[i][j] != cols[j]) {
                    grid[i][j] = Integer.min(rows[i], cols[j]);
                }
                ans += grid[i][j];
            }
        }

        return ans - sum;
    }
}