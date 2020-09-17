class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            for (int j = 0; j < i; j++) {
                if (index[j] >= idx) {
                    index[j]++;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}