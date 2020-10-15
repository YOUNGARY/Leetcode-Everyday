class Solution {
    public boolean isMonotonic(int[] A) {
        int up = 0, down = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] > 0) {
                up = 1;
            } else if (A[i] - A[i - 1] < 0) {
                down = 1;
            }
            if (up * down != 0) {
                return false;
            }
        }
        return true;
    }
}