class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int maxLen = 1, len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                maxLen = Integer.max(maxLen, len);
                len = 1;
            }
        }
        maxLen = Integer.max(maxLen, len);
        return maxLen;
    }
}