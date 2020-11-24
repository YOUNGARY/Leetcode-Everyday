class Solution {
    public int binaryGap(int n) {
        int max = 0, lastIdx = -1;
        for (int i = 0; n != 0; i++) {
            if ((n & 1) == 1) {
                if (lastIdx != -1) {
                    max = Integer.max((i - lastIdx), max);
                }
                lastIdx = i;
            }
            n >>= 1;
        }
        return max;
    }
}