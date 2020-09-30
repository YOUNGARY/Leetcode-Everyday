class Solution {
    public int[] getNoZeroIntegers(int n) {
        boolean hasZero = false;
        int[] ans = new int[2];
        for (int i = 1; i < n / 2 + 1; i++) {
            int B = n - i;
            if (isNoZeroInteger(i) && isNoZeroInteger(B)) {
                ans[0] = i;
                ans[1] = B;
                break;
            }
        }
        return ans;
    }

    boolean isNoZeroInteger(int n) {
        while (n != 0) {
            if (n % 10 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}