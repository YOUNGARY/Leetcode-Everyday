class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            if (k >= 0) {
                for (int j = 1; j < k + 1; j++) {
                    ans[i] += code[(i + j) % len];
                }
            } else {
                for (int j = -1; j >= k; j--) {
                    ans[i] += code[(i + j + len) % len];
                }
            }
        }
        return ans;
    }
}