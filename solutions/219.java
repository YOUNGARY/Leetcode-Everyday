class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (null == hashMap.get(nums[i])) {
                hashMap.put(nums[i], i);
            } else if (i - hashMap.get(nums[i]) <= k) {
                return true;
            } else if (i - hashMap.get(nums[i])> k) {
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }
}