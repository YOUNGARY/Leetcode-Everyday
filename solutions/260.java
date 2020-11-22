class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        int[] ans = new int[2];
        int idx = 0;
        for (int n : hashMap.keySet()) {
            if (hashMap.get(n) == 1) {
                ans[idx++] = n;
            }
            if (idx == 2) break;
        }
        return ans;
    }
}