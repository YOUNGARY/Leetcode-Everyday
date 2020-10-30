class Solution {
    public boolean validMountainArray(int[] A) {
        int len = A.length;
        if (len < 3) {
            return false;
        }
        int idx = 0, max = A[0];
        for (int i = 0; i < len; i++) {
            if (A[i] > max) {
                max = A[i];
                idx = i;
            }
        }
        if (idx == 0 || idx == len - 1) {
            return false;
        }
        for (int i = idx; i > 0; i--) {
            if (A[i] <= A[i - 1]) {
                return false;
            }
        }
        for (int i = idx; i < len - 1; i++) {
            if (A[i + 1] >= A[i]) {
                return false;
            }
        }
        return true;
    }
}