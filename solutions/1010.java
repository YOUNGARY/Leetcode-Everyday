class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int len = time.length, cnt = 0;
        int[] res = new int[60];
        for (int i = 0; i < len; i++) {
            res[time[i] % 60]++;
        }
        cnt += (res[0] * (res[0] - 1)) / 2;
        cnt += (res[30] * (res[30] - 1)) / 2;
        for (int i = 1; i < 30; i++) {
            cnt += (res[i] * res[60 - i]);
        }
        return cnt;
    }
}