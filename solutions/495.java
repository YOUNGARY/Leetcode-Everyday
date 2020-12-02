class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int len = timeSeries.length;
        if (len == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < len; i++) {
            if (timeSeries[i] - timeSeries[i - 1] <= duration) {
                sum += timeSeries[i] - timeSeries[i - 1];
            } else {
                sum += duration;
            }
        }
        return sum + duration;
    }
}