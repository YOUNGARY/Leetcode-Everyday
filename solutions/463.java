class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        int colLen = grid.length, rowLen = grid[0].length;
        for (int i = 0; i < colLen; i++) {
            for (int j = 0; j < rowLen; j++) {
                if (grid[i][j] == 1) {
                    // up
                    if (i - 1 < 0) {
                        sum++;
                    } else if (grid[i - 1][j] == 0) {
                        sum++;
                    }

                    // down
                    if (i + 1 >= colLen) {
                        sum++;
                    } else if (grid[i + 1][j] == 0) {
                        sum++;
                    }

                    // left
                    if (j - 1 < 0) {
                        sum++;
                    } else if (grid[i][j - 1] == 0) {
                        sum++;
                    }

                    // right
                    if (j + 1 >= rowLen) {
                        sum++;
                    } else if (grid[i][j + 1] == 0) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}