class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int dims = A.length, temp = 0;
        for (int i = 0; i < dims; i++) {
            for (int j = 0; j < (dims + 1) / 2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][dims - j - 1] ^ 1;
                A[i][dims - j - 1] = temp ^ 1;
            }
        }
        return A;
    }
}