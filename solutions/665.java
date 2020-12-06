class Solution {
    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for (int i = 1; i < len && cnt < 2; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) nums[i] = nums[i - 1];
            }
        }
        return cnt < 2;
    }
}