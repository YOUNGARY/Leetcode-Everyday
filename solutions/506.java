class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] pos = nums.clone();
        int len = nums.length;
        Arrays.sort(pos);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            hashMap.put(pos[i], len - i);
        }
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            if (hashMap.get(nums[i]) == 1) {
                res[i] = "Gold Medal";
            } else if (hashMap.get(nums[i]) == 2) {
                res[i] = "Silver Medal";
            } else if (hashMap.get(nums[i]) == 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = hashMap.get(nums[i]).toString();
            }
        }
        return res;
    }
}