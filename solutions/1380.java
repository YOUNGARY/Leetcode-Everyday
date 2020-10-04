class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[][] lucky = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int minLucky = matrix[i][0], luckyIndex = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minLucky) {
                    minLucky = matrix[i][j];
                    luckyIndex = j;
                }
            }
            lucky[i][luckyIndex] += 1;
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int maxLucky = -1, luckyIndex = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > maxLucky) {
                    maxLucky = matrix[i][j];
                    luckyIndex = i;
                }
            }
            lucky[luckyIndex][j] += 1;
        }

        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (lucky[i][j] == 2) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}