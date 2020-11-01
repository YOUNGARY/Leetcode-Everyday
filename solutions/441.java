class Solution {
    public int arrangeCoins(int n) {
        for (int i = 1; i <= n; i++) {
            if ((1 + i) * 0.5 * i > n) {
                return i - 1;
            }
        }
        return n;
    }
}