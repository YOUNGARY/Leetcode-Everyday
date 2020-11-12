class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        for (int n : nums1) {
            hashMap1.put(n, 1);
        }
        for (int n : nums2) {
            if (hashMap1.get(n) != null) {
                hashMap2.put(n, 1);
            }
        }
        int[] res = new int[hashMap2.size()];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap2.entrySet()) {
            res[idx++] = entry.getKey();
        }
        return res;
    }
}