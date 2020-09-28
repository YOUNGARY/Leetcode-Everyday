class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int start = - n / 2;
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                ans[i] = start++;
            }
        } else {
            for (int i = 0; i < n; i++) {
                ans[i] = start++;
                if (start == 0) start++;
            }
        }
        return ans;
    }
}