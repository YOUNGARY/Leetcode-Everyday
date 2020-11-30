class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new LinkedList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    list.add(List.of(i, j));
                }
            }
        }
        for (List<Integer> pair : list) {
            setZeros(pair.get(0), pair.get(1), matrix);
        }
    }
    
    void setZeros(int i, int j, int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int k = 0; k < rows; k++) {
            matrix[k][j] = 0;
        }
        for (int k = 0; k <cols; k++) {
            matrix[i][k] = 0;
        }
    }
}