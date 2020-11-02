class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        int times = nums.length / 2 + 1;
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) >= times) {
                return key;
            }
        }
        return 0;
    }
}