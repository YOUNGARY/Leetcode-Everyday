class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int product = 1, len = nums.length;
        leftProduct[0] = 1;
        for (int i = 1; i < len; i++) {
            leftProduct[i] = product * nums[i - 1];
            product = leftProduct[i];
        }
        product = 1; rightProduct[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            rightProduct[i] = product * nums[i + 1];
            product = rightProduct[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftProduct[i] * rightProduct[i];
        }
        return nums;
    }
}