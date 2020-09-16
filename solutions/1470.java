class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}

/**
 *
 * O(1) space complexity solution.
 * Because all nums are less than 1000(e.g. nums < 0b 11 1111 1111), we can 
 * use other bit position except the last ten bits to store the element after
 * shuffle operation. Therefore, program do not need extra memory.
 */
class Solution {
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < 2 * n; i++) {
            int shuffledIndex = i < n ? 2 * i : 2 * (i % n) + 1;
            nums[shuffledIndex] |= (nums[i] & 1023) << 10;
        }
        for (int i = 0; i < 2 * n; i++) {
            nums[i] >>= 10;
        }
        return nums;
    }
}