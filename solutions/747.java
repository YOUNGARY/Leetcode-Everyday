class Solution {
    public int dominantIndex(int[] nums) {
        int first = -1, second = -1;
        int firstIdx = 0, secondIdx = 0;
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > first) {
                second = first;
                secondIdx = firstIdx;
                first = nums[i];
                firstIdx = i;
            } else if (nums[i] > second) {
                second = nums[i];
                secondIdx = i;
            }
        }
        if (second == 0) {
            return firstIdx;
        }
        return  first / second >= 2 ? firstIdx : -1;
    }
}