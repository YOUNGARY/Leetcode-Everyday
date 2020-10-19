class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int j : A) {
            max = Math.max(j, max);
            min = Math.min(j, min);
        }

        int ans = 0;
        if (max - min > 2 * K) {
            ans = max - min - 2 * K;
        }
        return ans;
    }
}