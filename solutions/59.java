class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int arrow = 0, row = 0, col = 0;
        for (int i = 1; i <= n * n; i++) {
            ans[row][col] = i;
            if (row + direction[arrow][0] >= n || row + direction[arrow][0] < 0 ||
                    col + direction[arrow][1] >= n || col + direction[arrow][1] < 0 ||
                    ans[row + direction[arrow][0]][col + direction[arrow][1]] != 0) {
                arrow = (arrow + 1) % 4;
            }
            row += direction[arrow][0];
            col += direction[arrow][1];
        }
        return ans;
    }
}