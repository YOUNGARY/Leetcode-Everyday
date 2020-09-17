class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        
        int cnt = bucket[0];
        for (int i = 1; i < 101; i++) {
            cnt += bucket[i];
            bucket[i] = cnt - bucket[i];
        }
        bucket[0] = 0;

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = bucket[nums[i]];
        }
        return ans;
    }
}