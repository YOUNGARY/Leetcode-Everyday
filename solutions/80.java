class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int idx = 1, cnt = 1, last = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] == last) {
                cnt++;
            } else {
                last = nums[i];
                cnt = 1;
            }
            if (cnt <= 2) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}