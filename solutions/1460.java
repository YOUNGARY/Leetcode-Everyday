class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] nums = new int[1001];
        for (int a : arr) {
            nums[a]++;
        }
        for (int t : target) {
            nums[t]--;
            if (nums[t] < 0) {
                return false;
            }
        }

        return true;
    }
}