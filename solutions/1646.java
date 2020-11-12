class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 0;; i++) {
            if (2 * i > n) {
                break;
            }
            nums[2 * i] = nums[i];
            max = Integer.max(nums[2 * i], max);
            if ((2 * i + 1) > n) {
                break;
            }
            nums[2 * i + 1] = nums[i] + nums[i + 1];
            max = Integer.max(nums[2 * i + 1], max);
        }
        return max;
    }
}