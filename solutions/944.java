class Solution {
    public int minDeletionSize(String[] A) {
        int len = A[0].length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}