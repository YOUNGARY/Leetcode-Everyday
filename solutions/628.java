class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Integer.max(nums[len - 1] * nums[len - 2] * nums[len - 3], nums[len - 1] * nums[0] * nums[1]);
    }
}