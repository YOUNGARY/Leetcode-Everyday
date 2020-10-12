class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            if ((coordinates[i][1] - y1) * (x1 - x2) != (y1 - y2) * (coordinates[i][0] - x1)) {
                return false;
            }
        }
        
        return true;
    }
}