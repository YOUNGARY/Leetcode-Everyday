class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            cnt += countRowNegatives(grid[i]);
        }
        return cnt;
    }

    int countRowNegatives(int[] row) {
        int len = row.length;
        int start = 0, end = len - 1, mid = (start + end) / 2;

        if (row[start] < 0) return len;
        else if (row[end] >= 0) return 0;

        while (true) {
            if (row[mid] >= 0 && row[mid + 1] < 0) {
                break;
            } else if (row[mid] >= 0 && row[mid + 1] >= 0) {
                start = mid;
            } else if (row[mid] < 0 && row[mid + 1] < 0) {
                end = mid;
            }
            mid = (start + end) / 2;
            if (mid == start) {
                break;
            }
        }
        return len - mid - 1;
    }
}