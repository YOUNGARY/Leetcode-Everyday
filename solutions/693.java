class Solution {
    public boolean hasAlternatingBits(int n) {
        if (n == 1) return true;

        int bit = n & 1, last = bit;
        n = n >> 1;
        while (n != 0) {
            bit = n & 1;
            if (bit == last) {
                return false;
            }
            last = bit;
            n >>= 1;
        }
        return true;
    }
}
