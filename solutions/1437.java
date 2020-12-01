class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
        int lastIdx = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                if (lastIdx != -1 && i - lastIdx - 1 < k) {
                    return false;
                }
                lastIdx = i;
            }
        }
        return true;
    }
}